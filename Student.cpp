#include<iostream>
using namespace std;
class Student
{
public:
string fullName;
int rollNum;
double semPerentage;
string collegeName;
int collegeCode;
Student()
{
cout<<"Student class initialized!!\nIam a student\n";
}
~Student(){}
};
int main()
{
Student gayatri;
cout<<"Enter your name : ";
getline(cin,gayatri.fullName);
cout<<"Enter your roll number : ";
cin>>gayatri.rollNum;
cout<<"Enter your sem percentage : ";
cin>>gayatri.semPerentage;
cout<<"Enter your college name : ";
cin>>gayatri.collegeName;
cout<<"Enter your college code : ";
cin>>gayatri.collegeCode;
cout<<"Name : "<<venkat.fullName<<endl;
cout<<"RollNum : "<<gayatri.rollNum<<endl;
cout<<"SemPercentage : "<<gayatri.semPerentage<<endl;
cout<<"CollegeName : "<<gayatri.collegeName<<endl;
cout<<"CollegeCode : "<<gayatri.collegeCode<<endl;
return 0;
}
