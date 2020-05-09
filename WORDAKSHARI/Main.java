#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char a[50][50];
  int i;
  int n=0;
  for(i=0;i<5;i++)
  {
    cin>>a[i];
    n++;
    if(a[i][0]=='#')
         break;
  }
  cout<<a[0]<<"\n";
  for(i=0;i<n-1;i++)
  {
    if(a[i][strlen(a[i])-1]==a[i+1][0])
     cout<<a[i+1]<<"\n";
  }
}
