#include <iostream>
#include <cmath>
#define SIZE(x) sizeof(x) * 8
using namespace std;
void range(string datatype, int n)
{
    if(datatype.compare("SIGNED")==0)
    {
        int min=pow(2,n-1);
        int max= pow(2,n-1)-1;
        cout<<"Range from " << (-1) * min << " to " << max <<endl;
    }
    else
    {
        int range=pow(2,n)-1;
        cout<<"Range from 0 to " << range << endl;
    }
}
int main()
{
    cout<<"For Signed int: ";
    range("SIGNED",SIZE(int));
    cout<<"For Signed char: ";
    range("SIGNED",SIZE(char));
    cout<<"For Unsigned int: ";
    range("UNSIGNED",SIZE(unsigned int));
    cout<<"For Unsigned char: ";
    range("UNSIGNED",SIZE(unsigned char));
}
