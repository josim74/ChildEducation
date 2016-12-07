#include<iostream>
using namespace std;
int main()
{
    int n,sum=0,fact,i,r,temp;
    cin>>n;
    temp=n;
    while(n){
        r=n%10;
        fact=1;
        for(i=1;i<=r;i++){
            fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
    }
    if(sum==temp){
        cout<<"strong"<<endl;
    }
    else{
        cout<<"not"<<endl;
    }
    return 0;
}
