#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;cin>>n;int arr[n],i,flag=0;
  for(int i=0;i<n;i++)
    cin>>arr[i];
  int ele;
  cin>>ele;
  for(int i=0;i<n;i++)
  {
    if(arr[i]==ele)
    {
      flag=1;
    }
  }
  if(flag==1)
    cout<<ele<<" is present in the array";
  else
    cout<<ele<<" is not present in the array";
}