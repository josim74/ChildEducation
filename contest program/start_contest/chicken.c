#include<iostream>
using namespace std;
int main()
{
    int count=0;
    cout<<"Input a number : "<<endl;
    cin>>int n;
    if(n%2==1){
        cout<<"Chicken come first"<<endl;
    }
    else{
        while(n%2==0){
            n=n/2;
            count++;
        }
        if(count%2==0){
            cout<<"Chicken come first"<<endl;
        }
        else{
            cout<<"Egg come first"<<endl;
        }
    }

    return 0;
}
