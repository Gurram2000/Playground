#include<iostream>
using namespace std;
int main()
{
  int n,m,s=0,c=0,i,k;
  cin>>n>>m;
 for(i=0;i<n;i++)
 {
   cin>>k;
   s+=k;
 }
  if(s==m)
    cout<<"1";
  else
    cout<<1+s/m;
}