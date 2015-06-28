#include <iostream>
#include <string>

using namespace std;

int next_[10001];

void build(string P)
{
	int m = P.size() - 1;
	int k = 0;
	next_[1] = 0;
	for (int q = 2; q <= m; ++q)
	{
		while (k > 0 && P[k + 1] != P[q])
			k = next_[k];
		if (P[k + 1] == P[q])
			k++;
		next_[q] = k;
	}
}

void work(string s, string t)
{
	if (s.size() > 10000 || t.size() > 10000)
	{
		cout << "Too long" << endl;
	}
	s = " " + s;
	t = " " + t;
	build(t);

	int n = s.size() - 1;
	int m = t.size() - 1;
	int q = 0;
	bool fb = true;
	for (int i = 1; i <= n; ++i)
	{
		while (q > 0 && t[q + 1] != s[i])
			q = next_[q];
		if (t[q + 1] == s[i])
			q++;
		if (q == m)
		{
			if (fb)
			{
				cout << i - m;
				fb = false;
			}
			else
			{
				cout << ',' ;
				cout << i - m;
			}
			q = next_[q];
		}
	}
	if (fb)
	{
		cout << "False";
	}
	cout << "\n";
}

int main()
{
	string s, t;
	s = "fddfsaffdasfsfasdsassdasd";
	t = "sd";
	work(s, t);
	return 0;
}