#include<bits/stdc++.h>
using namespace std;
 int main()
 {
   char str[100];
   cin>>str;
   int m = strlen(str);
   if(m>20) cout<<"Invalid Input";
   else
   {
     int count=1;
     for(int i=0;str[i]!='\0';++i)
     {
       if(str[i]==str[i+1])
       {
         count++;
       }
       else
       {
         cout<<str[i]<<count;
         count=1;
       }
     }
   }
 }