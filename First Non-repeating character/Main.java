#include<bits/stdc++.h>
using namespace std;
int main()
{
  int i=0,flag=0;
  string str;
  getline(cin,str);
  while(flag!=1)
  {
flag=count(str.begin(),str.end(),str[i]);
    if(flag==1) cout<<str[i]; 
    i++;  
  }
}