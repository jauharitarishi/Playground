#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a=7,b=5;
int n;
  cin>>n;
  cout<<a<<" "<<b<<" ";
  for(int i=3;i<=n;i++)
  {
if(i%2==1)
{ a=a+1; cout<<a<<" ";}
    else
    { b=b+1;cout<<b<<" ";}
  }
}