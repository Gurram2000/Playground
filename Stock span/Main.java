#include<iostream>
using namespace std;
int main()
{
 int n,i,s[100],c=0;
 cin>>n;
 for(i=0;i<n;i++)
    cin>>s[i];
  cout<<"1\n";
  for(i=1;i<n;i++)
  {
    if(s[i]<s[i-1])
      cout<<"1\n";
  
    else
    {
      c+=2;
      cout<<c<<"\n";
    }
  }
}