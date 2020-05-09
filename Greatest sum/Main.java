#include<iostream>
using namespace std;
int main()
{
  int i,j,n,m,s[10][10],k=0,u=0,t;
  cin>>n>>m;
  cout<<"Sum of rows is ";
  for(i=0;i<n;i++)
  {
    k=0;
    for(j=0;j<m;j++)
    {
      cin>>s[i][j];
      k+=s[i][j];
    }
    cout<<k<<" ";
    if(u<k)
    {
      u=k;
      t=i;
    }
  }
  cout<<"\nRow "<<t+1<<" has maximum sum";
  u=0;
  cout<<"\nSum of columns is ";
 
  for(i=0;i<m;i++)
  {
    k=0;
    for(j=0;j<n;j++)
    {
      k+=s[j][i];
    }
    cout<<k<<" ";
      if(u<k)
      {
        u=k;
        t=i;
      }
  }
  cout<<"\nColumn "<<t+1<<" has maximum sum";
}