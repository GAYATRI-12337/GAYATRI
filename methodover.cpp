#include<iostream>
using namespace std;
class Gayatri
{
public:
void variant()
{
cout<<"I have a variant where we are similar in few ways\n";
}
void variant(string variantName)
{
cout<<"VariantName : "<<variantName<<endl;
}
};
int main()
{
Gayatri obj;
obj.variant(),obj.variant("A.Gayatri");
return 0;
}
