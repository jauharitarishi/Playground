#include<bits/stdc++.h>
using namespace std;
int main()
{
  int even=0,odd=0;
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
    {
      even++;
    }
    else
      odd++;
  }
  cout<<"Odd: "<<odd<<"\nEven: "<<even;
}