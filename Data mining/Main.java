#include<iostream>
int main()
{
  int n,e=0,o=0,u;
  std::cin>>n;
  while(n>0)
  {
    u=n%10;
    if(u%2==0)
      e+=u;
    else
      o+=u;
    n/=10;
  }
  if(e==o)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}
