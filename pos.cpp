#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    if(n>0)
    {
        cout<<"postive";
    }
    else if(n<0)
    {
        cout<<"Negative";
    }
    else
    {
        cout<<"Given number is zero";
    }
    return 0;
}
