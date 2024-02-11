#include<iostream>
#include<string>
using namespace std;
void Evenorodd(int number)
    {
        if(number%2==0)
        {
          cout<<"EVEN"<<endl;
        }
         else
        {
        cout<<"ODD"<<endl;
        }
    }
int main()
{
    

    cout<<"Enter a number to check whether it is even or odd "<<endl;
    int number;
    cin>>number;
   Evenorodd(number);

   
}
