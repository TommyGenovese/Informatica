#include <stdlib.h>
#include <stdio.h>
#define DIM 5

void caricaVett(int vett[DIM]) {
    int k;
    for(k=0; k<DIM; k++) {
        printf("indica numero nella posizione %d : \n",k);
        scanf("%d",&vett[k]);
    }
}

void vetParDis(int vett[DIM], int vett2[DIM], int vett3[DIM], int *pari, int *dispari) {
    int k;
    int p=0;
    int d=0;

    for(k=0; k<DIM; k++) {
        if(vett[k]%2 ==0) {
            vett2[p] =vett[k];
            p++;
            *pari= p;
        } else {
            vett3[d] =vett[k];
            d++;
            *dispari= d;
        }
    }
}


void stampaVett(int vett[DIM],int d) {
    int k;
    for(k=0; k<d; k++) {
        printf("Il numero pari e':  %d \n", vett[k] );
    }
}

main() {
    int vett[DIM];
    int vettpari[DIM];
    int vettdis[DIM];
    int pari;
    int dispari;

    caricaVett(vett);

    vetParDis(vett,vettpari,vettdis,&pari,&dispari);

    stampaVett(vettpari,pari);
    stampaVett(vettdis,dispari);

}
