#include<iostream>
using namespace std;
int main()
{
    int no,n,row,col,space;
    cin>>no;
    for(row=0;row<no;row++){
        for(space=0;space<no-row;space++){
            cout<<" ";
        }
        n=1;
        for(col=0;col<=row;col++){
            cout<<" "<<n;
            n=n*(row-col)/(col+1);
        }
        cout<<"\n";
    }
    return 0;
}
