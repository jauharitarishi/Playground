#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cout<<"Enter n value\n";
  cin>>n;
  int a=1,b=2,c=a+b;
  cout<<a<<" "<<b<<" "<<c<<" ";
  for(int i=4;i<=n;i++)
  {
    a=b;
    b=c;
    c=a+b;
    cout<<c<<" ";
  }
}
    