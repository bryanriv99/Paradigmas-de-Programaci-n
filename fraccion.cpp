#include <iostream>

using namespace std;

typedef struct f{
    int N;
    int D;
} fraccion;

fraccion suma (fraccion A, fraccion B);
void simplificar(fraccion &C);
void imprimir(fraccion D);

int main(){
    fraccion A={1,12};
    fraccion B={1,3};
    fraccion C;
    fraccion D={1,2};

    C = suma(D,D);
    simplificar(C);
    imprimir(C);

    return 0;
}

fraccion suma(fraccion A, fraccion B){
    fraccion R;
    R.D = A.D * B.D;
    R.N = (A.N * A.D) + (A.N * B.D);
    return R;
}

void simplificar(fraccion &C){
    int mayor, menor, mcd, i;
    
    if(C.N == 1 || C.D == 1){
        return;
    }

    if(C.N == C.D){
        C.N = C.D = 1;
    }
    
    if(C.D > C.N){
        mayor = C.D;
        menor = C.N;
    } else{
        menor = C.D;
        mayor = C.N;
    }

    if(mayor%menor == 0){
        mcd = menor;
    } else{
        for(i = 1; i<= menor; i++){
            if(C.N%i == 0 && C.D%i == 0){
                mcd = i;
            }
        }
    }

    C.N/= mcd;
    C.D/= mcd;

}

void imprimir(fraccion D){
    cout<<D.N<<"/"<<D.D<< endl;
}