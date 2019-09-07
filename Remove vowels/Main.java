#include<stdio.h>
#include<string.h>
int check_vowel(char ch)
{
  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='I')
    return 1;
  else
    return 0;
}
int main()
{
  char str[100],t[100];
  int j=0;
  gets(str);
  for(int i=0;str[i]!='\0';++i)
  {
    //ch=str[i];
    if(check_vowel(str[i])==0)
    {
      t[j]=str[i];
      j++;
    }
  }
  t[j]='\0';
  strcpy(str,t);
  puts(str);
  return 0;
}