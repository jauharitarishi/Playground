#include<bits/stdc++.h>
using namespace std;
int main()
{
  long int n,f=1;
  cin>>n;
  while(n>0)
  {
    f=f*n;
    n--;
  }
  cout<<f;
}