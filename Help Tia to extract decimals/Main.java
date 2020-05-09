#include<iostream>
#include<cstring>
int main() 
{ 
	std::string fnum;
    std::cin>>fnum;
     int n=0;
     n=fnum.find('.');
     std::cout<<"Floating part is : ";
    if(n==-1)
      std::cout<<"";
     else
      for(int i=n+1;i<fnum.length();i++)
        std::cout<<fnum[i];
}