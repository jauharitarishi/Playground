#include<bits/stdc++.h>
using namespace std;
int dectob(int n)
{
  int bin[32], i=0;
  while(n>0)
  {
    bin[i]=n%2;
    n=n/2;
    i++;
  }
  for(int j=i-1;j>=0;--j)
  {
    cout<<bin[j];
  }
  return 0;
}
int main()
{
  int n;cin>>n;
  dectob(n);
}