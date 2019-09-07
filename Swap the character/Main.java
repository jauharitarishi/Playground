#include<bits/stdc++.h>
#include<string>
using namespace std;
 int main()
 {
   char a[100],b[100],c[10000];
   //char a1[100],b1[100],c1[10000];
   cin>>a>>b>>c;
   for(int i=0;a[i]!='\0';++i)
   {
     //char ch,d='$';
     if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
     {
       cout<<'$';
     }
     else
       cout<<a[i];
   }
   for(int i=0;b[i]!='\0';++i)
   {
     if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U')
     {
       cout<<b[i];
     }
     else
       cout<<'#';
   }
   for(int i=0;c[i]!='\0';++i)
   {
     char ch=toupper(c[i]);
     cout<<ch;
   }
 
 }