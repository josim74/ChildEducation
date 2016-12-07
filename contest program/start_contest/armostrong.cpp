#include<iostream>
using namespace std;
int main()
{
    int a,b,c,sum=0;
    cin>>a;
    b=a;
    while(a){
        c=a%10;
        sum=sum+(c*c*c);
        a=a/10;
    }
    if(sum==b){
        cout<<"The number "<<b<<" is armostrong number"<<endl;
    }
    else{

        cout<<"The number "<<b<<" is not armostrong number"<<endl;
    }
}
