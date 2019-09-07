#include<bits/stdc++.h>
using namespace std;
int main()
{
  int flag,num,ele,arr[100];
  cin>>num;
  for(int i=0;i<num;++i)
  {
    cin>>arr[i];
  }
  cin>>ele;
  for(int i=0;i<num;++i)
  {
    if(ele==arr[i])
    {
      flag=1;
      cout<<i+1;
    }
  }
  if(flag!=1) cout<<ele<<" isn't present in the array.";
}