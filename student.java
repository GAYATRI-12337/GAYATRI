#include<iostream>
using namespace std;
class Student{
public:
virtual void type()=0;
};
class FrontBench : public Student{
public:
void type()
{
cout<<"Gayatri - I am a frontbench Student"<<endl;
}
};
class BackBench : public Student{
public:
void type()
{
cout<<"Sai - I am a backbench Student"<<endl;
}
};
int main()
{
FrontBench gayatri;
gayatri.type();
BackBench sai;
sai.type();
}


