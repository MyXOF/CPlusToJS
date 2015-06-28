#include <iostream>
#include <string>

using namespace std;

char operS[1000];
double numS[1000];
int operP, numP;
int prior[128];

void init()
{
	operP = 1;
	numP = 0;
	operS[0] = '#';
	prior['@'] = 1; // End symbol
	prior['#'] = 0;
	prior['('] = 1;
	prior[')'] = 1;
	prior['+'] = 2;
	prior['-'] = 2;
	prior['*'] = 3;
	prior['/'] = 3;
	return ;
}

double Abs(double k)
{
	if (k < 0)
		return 0-k;
	return k;
}

int CalculateOper(char oper)
{
    if (oper == '(')
        return 2;
    if (numP < 2)
    	return 1;
    double result;
    if (oper == '+')
    	result = numS[numP - 2] + numS[numP - 1];
    if (oper == '-')
    	result = numS[numP - 2] - numS[numP - 1];
    if (oper == '*')
    	result = numS[numP - 2] * numS[numP - 1];
    if (oper == '/')
    {
    	if (Abs(numS[numP - 1]) < 0.0000001)
    		return 3;
    	result = numS[numP - 2] / numS[numP - 1]; 
    }
    numS[numP - 2] = result;
    numP--;
    return 0;
}

int ProcessOper(char oper)
{
    int code;
    if (oper == '(')
    {
        operS[operP++] = oper;
        return 0;
    }
    if (oper == ')')
    {
        while (operS[operP - 1] != '(')
        {
            if (operS[operP - 1] == '#')
                return 2;//Bracket not match
            code = CalculateOper(operS[operP - 1]);
            if (code > 0)
                return code;
            operP--;
        }
        operP--;
        return 0;
    }
    while (prior[oper] <= prior[operS[operP - 1]])
    {
        code = CalculateOper(operS[operP - 1]);
        if (code > 0)
            return code;
        operP--;
    }
    operS[operP] = oper;
    operP++;
    return 0;
}



//Error code
//1:Too many operators
//2:Bracket not match
//3:Divided by 0

void printErr(int code)
{
	if (code == 1)
		cout << "Error: Too many operators" << endl;
	if (code == 2)
		cout << "Error: Bracket not match" << endl;
	if (code == 3)
		cout << "Error: Divided by 0" << endl;
	return ;
}

bool isDigit(char c)
{
	if (c >= '0' && c <= '9')
		return true;
	return false;
}

bool isOper(char c)
{
	if (c == '+' || c == '-' || c == '*' || c == '/')
		return true;
	if (c == '(' || c == ')')
		return true;
	return false;
}

void work(string s)
{
	init();
	int l = s.size();
	int state = 0; //0:operator 1:number
	int number = 0;
	bool neg = false;
	for (int i = 0; i < l; ++i)
	{
		if (isDigit(s[i]))
		{
			number = number * 10 + s[i] - '0';
			state = 1;
			continue;
		}
		if (isOper(s[i]))
		{
			if (state == 1)
			{
				state = 0;
				if (neg)
					number = -number;
				numS[numP] = number;
				numP++;
				number = 0;
				neg = false;
			}
			//Parse negative number
			if (s[i] == '-' && (i == 0 || s[i - 1] == '('))
			{
				neg = true;
				continue;
			}
			int code = ProcessOper(s[i]);
			if (code > 0)
			{
				printErr(code);
				return ;
			}
			continue;
		}
		printErr(1);
		return ;
	}
	if (state == 1)
	{
		if (neg)
			number = -number;
		numS[numP] = number;
		numP++;
	}
	int code = ProcessOper('@');
	if (code > 0)
	{
		printErr(code);
		return ;
	}
	else
	{
		cout << numS[0] << endl;
	}
}

int main()
{
	string s;
	cin >> s;
	work(s);
	return 0;
}