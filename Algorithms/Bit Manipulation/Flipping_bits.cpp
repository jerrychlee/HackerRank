#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n = 0;
    unsigned int z = ~0;
    unsigned int num = 0;
    cin>>n;
    for(int i=0; i<n; i++){
        cin>>num;
        num = num^z;
        cout<<num<<"\n" ;
    }
    return 0;
}
