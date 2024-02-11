#include<iostream>
#include<string>
using namespace std;
int main()
{
    cout<<"Enter the 2 operands: "<<endl;
    float number1,number2;
    cin>>number1>>number2;
    cout<<"1.Addition ,2.Substraction ,3.Multiplication ,4.Division"<<endl;
    cout<<"Enter your choice: "<<endl;
    int choice;
    cin>>choice;
    switch(choice)
    {
        case 1:
           cout<<"Addition of "<<number1<<" and "<<number2<<" is "<<number1+number2<<endl;
           break;
        case 2:
           cout<<"substraction of "<<number1<<" and "<<number2<<" is "<<number1-number2<<endl;
           break;
        case 3:
           cout<<"Multiplication of "<<number1<<" and "<<number2<<" is "<<number1*number2<<endl;
           break;
        case 4:
           cout<<"Division of "<<number1<<" and "<<number2<<" is "<<number1/number2<<endl;
           break;
        default:
          cout<<"Enter valid choice!!"<<endl;
        
            

    }
