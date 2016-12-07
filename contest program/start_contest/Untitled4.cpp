#include<iostream>
using namespace std;
int main()
{
    float i;
    int w;
    cin>>w>>i;
    if(w%5==0 && w<i){
        i=i-w-0.5;
    }
    cout<<i<<endl;
    return 0;
}
