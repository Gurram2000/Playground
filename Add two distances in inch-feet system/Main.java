#include<iostream>
using namespace std;
int main()
{
  int a1,b1,fee;
  float a2,b2,inc;
  cin>>a1>>a2>>b1>>b2;
  fee=a1+b1;
  inc=a2+b2;
  if(inc>12.0)
  {
    inc-=12.0;
    fee++;
  }
  cout<<fee<<"\'-"<<inc<<"\"";
}