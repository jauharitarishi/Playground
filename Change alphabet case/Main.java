#include<bits/stdc++.h>
using namespace std;
int main()
{
char ch;
  cin>>ch;
  if(islower(ch))
  {ch=toupper(ch);
    cout<<ch;}
  else
  {ch=tolower(ch);
  cout<<ch;
}
}