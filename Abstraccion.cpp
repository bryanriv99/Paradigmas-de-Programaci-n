#include <iostream>
#include <cstring>

using namespace std;

typedef struct u{
    char nombre[50];
    double capacidad;
    double uso;
    char tipo;
} USB;

typedef struct c{
    int dia;
    int mes;
    int ano;
} Fecha;

//ejercicio 1
void formatear(USB& M, char SistArch, char * NuevoNombre);
void mostrarPropiedades(USB U);
void cambiarNombre(char* Nuevonombre, USB M);
//ejercicio 2
void siguientedia(Fecha&);
int  NumdediasMes(Fecha);
int esfindemes(Fecha);

int esfindemes(Fecha f){
    if(f.dia == 31 && (f.mes == 1 || f.mes == 3 || f.mes == 5 || f.mes == 7 || f.mes == 8 || f.mes == 10 || f.mes == 12)){
        return 1;
    } else if(f.dia == 30 && (f.mes == 4 || f.mes == 6 || f.mes == 9 || f.mes == 11)){
        return 1;
    } else if(f.dia == 28 && f.mes == 2){
        return 1;
    } else {
        return 0;
    }
}

int NumdediasMes(Fecha f){
    if (f.mes == 1 || f.mes == 3 || f.mes == 5 || f.mes == 7 || f.mes == 8 || f.mes == 10 || f.mes == 12){
        return 31;
    }else if(f.mes == 4 || f.mes == 6 || f.mes == 9 || f.mes == 11){
        return 30; 
    }else{
        return 28;
    }
}

void siguientedia(Fecha& f){
    if(f.dia == 31 && (f.mes == 1 || f.mes==3 || f.mes==5 || f.mes==7 || f.mes==8 || f.mes==10)){
        f.dia = 1;
        f.mes++;
    }else if(f.dia == 28 && f.mes == 2){
        f.dia = 1;
        f.mes++;
    }else if(f.dia == 30 && (f.mes == 4 || f.mes==6 || f.mes==9 || f.mes==11)){
        f.dia = 1;
        f.mes++;
    }else if( f.dia == 31 && f.mes == 12){
        f.dia = 1;
        f.mes = 1;
        f.ano++;
    }else{
        f.dia++;
    }
}

//ejercicio 1
void formatear(USB& M, char SistArch, char * NuevoNombre){
    cambiarNombre(NuevoNombre,M);
    M.tipo = SistArch;
    M.uso = 0.00;
}

void cambiarNombre(char* Nuevonombre, USB M){
    strcpy(M.nombre,Nuevonombre);
}


void mostrarPropiedades(USB U){
    cout<<"Nombre: "<<U.nombre<<endl;
    printf("Capacidad: %.2f\nCantidad en uso: %.2f\n",U.capacidad,U.uso);
    cout<<"Tipo: "<<U.tipo<<endl;
}