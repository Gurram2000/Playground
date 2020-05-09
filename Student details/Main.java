#include<iostream>
#include<cstring>
using namespace std;
struct Student { 
  char name[30]; 
  char department[20]; 
  int yearOfStudy; 
  float cgpa;
};
int main()
{
  struct Student s[10];
  int i,n,t,j;
  char h[30];
  float y;
  cout<<"Enter the number of students";
  cin>>n;
  for(i=0;i<n;i++){
   cout<<"\nEnter the details of student "<<i+1;
   cout<<"\nEnter name";
   cin>>s[i].name;
   cout<<"\nEnter department";
   cin>>s[i].department;
   cout<<"\nEnter year of study";
   cin>>s[i].yearOfStudy;
   cout<<"\nEnter cgpa";  
   cin>>s[i].cgpa;
  }
  for(i=0;i<n;i++)
  for(j=i+1;j<n;j++)
  if(strcmp(s[i].name,s[j].name)>0)
   {
    strcpy(h,s[i].name);
    strcpy(s[i].name,s[j].name);
    strcpy(s[j].name,h);
    strcpy(h,s[i].department);
    strcpy(s[i].department,s[j].department);
    strcpy(s[j].department,h);
    t=s[i].yearOfStudy;
    s[i].yearOfStudy=s[j].yearOfStudy;
    s[j].yearOfStudy=t;
    y=s[i].cgpa;
    s[i].cgpa=s[j].cgpa;
    s[j].cgpa=y;
   }
  cout<<"\nDetails of students";
  for(i=0;i<n;i++)
  {
  cout<<"\nStudent "<<i+1;  
  cout<<"\nName:"<<s[i].name;
  cout<<"\nDepartment:"<<s[i].department;
  cout<<"\nYear of study:"<<s[i].yearOfStudy;
  cout<<"\nCGPA:"<<s[i].cgpa;  
  }
}