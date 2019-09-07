#include<bits/stdc++.h>
#include<algorithm>
using namespace std;
int main()
{
string str;
  getline(cin,str);
  sort(str.begin(),str.end());
  cout<<"The sorted string is "<<str;
}