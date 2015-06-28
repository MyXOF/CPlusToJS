#include <iostream>
#include <string>

using namespace std;

void print(string s)
{
	cout << s << endl;
}

void work(string s)
{
	int l = s.size();
	bool result = true;
	for (int i = 0; i < l / 2; ++i)
	{
		if (s[i] != s[l - i - 1])
		{
			result = false;
			break;
		}
	}
	if (result)
	{
		print("True");
	}
	else
	{
		print("False");
	}
}

int main()
{
	string s;
	cin >> s;
	work(s);
	return 0;
}