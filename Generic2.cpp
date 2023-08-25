using namespace std;
#include<iostream>

// Application for generic programming
template <class T>
T Addition(T i, T j)
{
    T result ;
    result = i+ j;
    return result;
}

int main()
{
    int i;
    float f;
    double d;

    i = Addition(10, 11);
    cout<<i<<"\n";
    f = Addition(10.7f, 89.5f);
    cout<<f<<"\n";
    d = Addition(10.8, 70.8);
    cout<<d<<"\n";
    return 0;
}