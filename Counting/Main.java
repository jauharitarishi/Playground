#include<bits/stdc++.h>
using namespace std;
int main()
{
  int vow=0,cons=0,symbol=0,space=0,num=0,i=0; 
string str;
  getline(cin,str);
  transform(str.begin(),str.end(),str.begin(),::tolower);
  int m=str.length();
  while(m--)
  {
if(str[i]=='a'|| str[i]=='e'|| str[i]=='i'|| str[i]=='o'|| str[i]=='u')
{
vow++;
}
    else if(str[i]>='a' && str[i]<='z')
    {
cons++;
    }
    else if(str[i]>'0' && str[i]<'9')
    {
num++;
    }
    else if(str[i]==' ')
    {
space++;
    }
    else
    {
      symbol++;
    }
    i++;
  }
  cout<<"Vowels:"<<vow<<"\nConsonants:"<<cons<<"\nWhite Spaces:"<<space<<"\nDigits:"<<num<<"\nSymbols:"<<symbol;
}