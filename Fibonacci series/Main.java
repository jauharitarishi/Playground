#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a=0,b=1,c;
  c=a+b;
  cout<<a<<" "<<b<<" "<<c<<" ";
  for(int i=4;i<=n;i++)
  {
    a=b;
    b=c;
    c=a+b;
    cout<<c<<" ";
  }
}
    