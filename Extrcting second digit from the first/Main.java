#include <stdio.h>
int main() {
  int num,n,digit=0,sec_digit,r;
  scanf("%d",&num);
  n=num;
  while(n>0)
  {
    n=n/10;
    digit++;
  }
  r=num/pow(10,digit-2);
  sec_digit=r%10;
  printf("%d",sec_digit);
	//Type your code
	return 0;
}