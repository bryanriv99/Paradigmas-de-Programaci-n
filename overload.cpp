#include <iostream>
#include <cstring>

typedef struct Fraccion{
    int numerador;
    int denominador;
} Fraccion;

int comparar(Fraccion, Fraccion);
int comparar(int, int);
int comparar(char *, char *);

int main(){
    Fraccion F1, F2;
    F1.numerador = 1;
    F1.denominador = 2;
    F2.numerador = 1;
    F2.denominador = 3;

    int c1, c2, c3;
    int a = 10, b = 20;
    char cadena1 [10] = "huaraches";
    char cadena2 [10] = "tacos";
    
    c1 = comparar(F2,F1);
    if(c1 == 0){
        printf("%d/%d es igual a %d/%d\n", F1.numerador,F1.denominador,F2.numerador, F2.denominador);
    }else if(c1 == 1){
        printf("%d/%d es mayor a %d/%d\n", F1.numerador,F1.denominador,F2.numerador, F2.denominador);
    }else{
        printf("%d/%d es menor a %d/%d\n", F1.numerador,F1.denominador,F2.numerador, F2.denominador);
    }
    
    c2 = comparar(a,b);
    if(c2 == 0){
        printf("\n%d es igual a %d\n",a,b);
    }else if(c2 == 1){
        printf("\n%d es mayor a %d\n",a,b);
    }else{
        printf("\n%d es menor a %d\n",a,b);
    }

    c3 = comparar(cadena1, cadena2);
    if(c3 == 0){
        printf("\nLa longitud de la cadena %s es igual a la cadena %s\n",cadena1,cadena2);
    }else if(c3 == 1){
        printf("\nLa longitud de la cadena %s es mayor a la cadena %s\n",cadena1,cadena2);
    }else{
        printf("\nLa longitud de la cadena %s es menor a la cadena %s\n",cadena1,cadena2);
    }

    printf("\n%d\t%d\t%d",c1,c2,c3);

    return 0;
}

int comparar(char *E1, char *E2){
    int c1,c2;
    c1 = strlen(E1);
    c2 = strlen(E2);
    
    if(c1 == c2){
        return 0;
    }else if(c1 > c2){
        return 1;
    }else{
        return -1;
    }
}


int comparar(int E1, int E2){
    if(E1 == E2){
        return 0;
    }else if(E1 > E2){
        return 1;
    }else{
        return -1;
    }
}

int comparar(Fraccion f1, Fraccion f2){
    float comp1, comp2;
    comp1 = static_cast<float>(f1.numerador)/f1.denominador;
    comp2 =  static_cast<float>(f2.numerador)/f2.denominador;
    
    if(comp1 == comp2){
        return 0;
    }else if(comp1 > comp2){
        return 1;
    }else{
        return -1;
    }
}