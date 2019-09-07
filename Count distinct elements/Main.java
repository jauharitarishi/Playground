#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  vector<int> ::iterator ip;
  vector<int> v;
  for(int i=0;i<n;i++)
  {
    int a;
    cin>>a;
    v.push_back(a);
  }
  sort(v.begin(), v.end());
  int count=0;
  count=distance(v.begin(),unique(v.begin(), v.begin()+n));
        cout<<"There are "<<count<<" distinct elements in the array.";
                 }