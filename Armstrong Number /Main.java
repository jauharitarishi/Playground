#include <stdio.h>
#include<math.h>
int main() {
  int n,num,digit=0,sum=0,r;
  scanf("%d",&num);
  n=num;
  while(n!=0)
  {
    n=n/10;
    ++digit;
  }
  n=num;
  while(n>0)
  {
    r=n%10;
    sum=sum+pow(r,digit);
    n=n/10;
  }
 //printf("%d %d",sum,digit);
  if(sum==num)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}