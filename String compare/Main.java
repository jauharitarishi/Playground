#include<bits/stdc++.h>
using namespace std;
int main()
{
  string str1,str2;
  getline(cin,str1);
  getline(cin,str2);
  if(str1.compare(str2)==0)
    cout<<"Strings are same";
  else
    cout<<"Not";
}