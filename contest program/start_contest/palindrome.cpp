#include<iostream>
using namespace std;
int main()
{
    int a,b,c,d,e=0;
    cin>>a;
    b=a;
    while(a){
        d=a%10;
        e=d+(e*10);
        a=a/10;
    }
    if(e==b){
        cout<<"The number is a palindrome"<<endl;
    }
    else{
        cout<<"The number is not a palindrome"<<endl;
    }
}
