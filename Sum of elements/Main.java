#include<bits/stdc++.h>
using namespace std;
int main()
{
int n;
  cin>>n;
  vector<int> vect;
  for(int i=0;i<n;i++)
  {
    int a;
    cin>>a;
    vect.push_back(a);
  }
  int sum=0;
  for(vector<int>::iterator i=vect.begin();i!=vect.end();++i)
  {
    sum=sum+(*i);
  }
  cout<<sum;
}