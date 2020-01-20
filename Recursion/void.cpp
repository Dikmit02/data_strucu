#include<iostream>
using namespace std;

void printIncr(int st,int en){
    if(st==en+1){
        return;
    }
    cout<<st<<endl;
    printIncr(st+1,en);
}
void printDesc(int st,int en){
    if(st==en+1){
        return;
    }
   
    printDesc(st+1,en);
     cout<<st<<endl;
}
int fact(int n){
    if(n==1){
        return 1;
    }
    int RecAns=fact(n-1)*n;
    return RecAns;
}

int main(){
    // printIncr(0,10);
    // printDesc(0,10);
    cout<<fact(5);
    return 0;

}