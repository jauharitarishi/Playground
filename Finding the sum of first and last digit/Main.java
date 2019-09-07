#include <stdio.h>
int main() {
  int n,num,first_digit,last_digit,sum=0,digit;
  scanf("%d",&num);
  n=num;
  while(n>0)
  {
	n=n/10;
    digit++;
  }
  last_digit=num%10;
  first_digit=num/pow(10,digit-1);
  sum = last_digit + first_digit;
	printf("%d",sum);	
  //Type your code
	return 0;
}