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
    if(str[i]=='a'|| str[i]=='o'|| str[i]=='e'|| str[i]=='i'|| str[i]=='u')
    {
      flag++;
    }
  }
  cout<<"Number of vowels: "<<flag;
}