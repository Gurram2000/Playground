#include<stdio.h>
int main()
{
  int i,j,k,l,m,n;
  scanf("%d%d",&i,&j);
  k=i+j;
  for(m=1;m<k;m++)
  {
   if(k%m==0)
     n=n+m;
  }
  if(k==n)
    printf("They can read the message");
  else
    printf("They can't read the message");
}