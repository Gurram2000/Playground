
#include <bits/stdc++.h> 

 
using namespace std; 



int main() 
{ 
    int N,i,j,sum1=0,sum2=0,s1=0,s2=0,s3=0,flag=0;
    cin>>N;
	int mat[100][100];
    for(i=0;i<N;i++){
       for(j=0;j<N;j++){
           cin>>mat[i][j];
           if(i==j)
             sum1+=mat[i][j];
           if(j==N-i-1)
             sum2+=mat[i][j];
             
       }
    }
    if(sum1==sum2)
      cout<<"Yes";
    else
      cout<<"No";
  
  
   	
}