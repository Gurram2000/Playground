#include<iostream>
using namespace std;
int main()
{
  int n,m,i,k,s=0;
  cin>>n>>m;
  for(i=0;i<n;i++){
    cin>>k;
    s+=k;
  }
  if(s<=m)
    cout<<"YES";
  else
    cout<<"NO";
}