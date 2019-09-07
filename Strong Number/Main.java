#include <stdio.h>
int main() {
  int num,n,r,sum=0,f;
  scanf("%d",&num);
  n=num;
  while(n>0)
  {
    r=n%10;
    f=1;
    for(int i=1;i<=r;i++)
    {
      f=f*i;
    }
    sum=sum+f;
    n=n/10;
  }
  if(sum==num)
    printf("Yes");
  else
    printf("No");
	return 0;
}