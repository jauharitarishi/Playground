#include<bits/stdc++.h>
using namespace std;
int main()
{
string str;int i=0;
  getline(cin,str);
  int m=str.length();
  while(m--)
  {
    if(str[i]>='a' && str[i]<='z')
    {
cout<<str[i];
    }
    i++;
  }
}
    