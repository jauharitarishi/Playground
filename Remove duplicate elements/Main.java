#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  vector<int> v;
  vector<int>::iterator ip;
  for(int i=0;i<n;i++)
  {
int a;
    cin>>a;
    v.push_back(a);
  }
  sort(v.begin(),v.end());
  ip=unique(v.begin(),v.begin()+n);
  v.resize(distance(v.begin(),ip));
  for(ip=v.begin();ip!=v.end();ip++)
           {
             cout<<*ip<<endl;
           }
           }