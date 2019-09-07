#include<bits/stdc++.h>
using namespace std;
int main()
{
  int flag=0;
string str;
  getline(cin,str);
  int m=str.length();
  for(int i=0;i<m;i++)
  {
	if(str[i]!=str[m-i-1])
      flag=1;
  }
  if(flag==0) cout<<"Palindrome";
    else cout<<"not";
}