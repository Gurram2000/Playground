#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,k,i,t,u,y,z;
  cin>>n;
  k=n*n;
  y=log10(k)+1;
  for(i=1;i<=y;i++)
  {
    z=pow(10,y-i);
    t=k/z;
    u=k%z;
    if(t+u==n)
    {
      printf("Kaprekar Number");
      return 0;
    }
  }
  printf("Not a Kaprekar Number");
}