#include<iostream>
using namespace std;
int main()
{
    int f=0,s=1,next,i=0,l;
    cin>>l;
    while(i<l){
            if(i<=1){
                next=i;
            }
        else{
            next=f+s;
            f=s;
            s=next;
        }
        cout<<next<<" ";
        i++;
    }
    return 0;
}
