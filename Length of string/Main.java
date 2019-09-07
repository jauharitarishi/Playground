#include<bits/stdc++.h>
using namespace std;
int main()
{
  int flag=0;
  string str;
  getline(cin,str);
  for(int i=0;str[i]!='\0';++i)
  {
    flag++;
  }
  cout<<flag;
}