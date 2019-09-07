#include<bits/stdc++.h>
using namespace std;
int main()
{
  int m,flag=0,i=0;
  string str;
  getline(cin,str);
  m=str.length();
  sort(str.begin(),str.end());
  while(str[i]!='\0')
  {
	flag=count(str.begin(),str.end(),str[i]);
    cout<<str[i]<<" "<<flag<<endl;
    i=i+flag;
  }
}