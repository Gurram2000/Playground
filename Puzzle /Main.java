#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c,s[100][100],i,j;
  cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>s[i][j];
  for(i=0;i<c;i++){
    for(j=0;j<r;j++)
      cout<<s[j][i]<<" ";
    cout<<"\n";
  }
  
}