#include <iostream>
#include <string>

using namespace std;

void print(string s)
{
	cout << s+"\n" ;
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
	string s1 = "abcddcba";
	work(s1);
	string s2 = "12dad12";
	work(s2);
	return 0;
}