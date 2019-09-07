#include<bits/stdc++.h>
using namespace std;  
int main()  
{  int i;
    char str1[100],str2[100];
  cin>>str1;
  //int m=str1.length();
  for( i=0;str1[i]!='\0';i++)
  {
	str2[i]=str1[i];
  }
  str2[i]='\0';
  cout<<"The copied string is "<<str2<<".";
  
}  