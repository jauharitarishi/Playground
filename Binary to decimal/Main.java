#include<stdio.h>
#include<math.h>
int main()
{
  int n,rem,i=0,dec_number=0;
  scanf("%d",&n);
  while(n>0)
  {
   rem=n%10;
   n=n/10;
   dec_number=dec_number + rem * pow(2,i);
    i++;
  }
  printf("%d",dec_number);
  return 0;
}