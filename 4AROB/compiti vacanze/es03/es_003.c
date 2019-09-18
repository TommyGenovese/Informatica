/* 
Es: 003
Author: Genovese Tommaso
Data: 15/08/2019
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#define DIM 5

bool VerSpecuVettInt(int vett[], int num){
    bool eSpecu;
    eSpecu = true;
    for(int k=0; k<num; k++){
        if(vett[k] != vett[(num-1)-k] ){
            eSpecu=false;
        }
    }
    return eSpeculare;
}


void caricaVett(int v[DIM]){
    int k;
    for(k=0; k<DIM; k++){
        printf("Inserire il numero in posizione %d : \n", k);
        scanf("%d", &v[k]);
    }
}



main(){

int vett[DIM];
bool test;

caricaVett(vett);
test= VerSpecuVettInt(vett,DIM);

if(test==true){
    printf("e' speculare");
}else{
    printf("non e' speculare");
}
}

