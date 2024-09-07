#include <iostream>

using namespace std;

void comprarpelis(float & saldo, int NP, float precio){
    saldo -= NP * precio;
}

int main(){
    
    float saldo = 600.0F;
    comprarpelis(saldo,3,100.F);
    cout<<saldo;


    /*int w = 5;
    int &Garu = w;
    
    w++;
    
    cout<<Garu<<endl;
    
    //cout<<w<<endl;*/
    
    return 0;
}