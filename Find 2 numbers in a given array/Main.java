#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,arr[100],ele1,ele2,flag1=0,flag2=0,temp1,temp2;
  cin>>n;
  for(int i=0;i<n;++i)
  {
    cin>>arr[i];
  }
  cin>>ele1>>ele2;
  for(int i=0;i<n;++i)
  {
    if(arr[i]==ele1)
    {
      flag1=1; temp1=i;
    }
    else if(arr[i]==ele2)
    {
      flag2=1; temp2=i;
    }
  }
  if(flag1==1) cout<<"Element 1 index = "<<temp1<<endl;
  else cout<<"Element 1 index = -1"<<endl;
  if(flag2==1) cout<<"Element 2 index = "<<temp2<<endl;
  else cout<<"Element 2 index = -1";
}