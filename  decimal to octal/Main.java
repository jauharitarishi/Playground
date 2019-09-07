#include<bits/stdc++.h>
using namespace std;
int main()
{
  int num,oct=0,rem,placevalue=1;
  cin>>num;
  while(num>0)
  {
    oct=oct+(num % 8) * placevalue;
    num=num/8;
    placevalue=placevalue * 10;
  }
  cout<<oct;
}