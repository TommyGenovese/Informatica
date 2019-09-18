/*
Es: 004
Author: Genovese Tommaso
Data: 16/08/2019
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#define DIM 5

void caricaVett(int v[DIM], int n) {
        int k;
        for(k=0; k<n; k++) {
                printf("Inserire il numero in posizione %d : \n", k);
                scanf("%d", &v[k]);
           
    }
}

void scambioEleVettIndirInt(int *x,int *y) {
        int z;
        z=*x;
        *x=*y;
        *y=z;
        return;
}

int CercaOrdDisgInt(int v[],int n,int x) {
        int tro,k;
        tro=-1;
        k=0;
        while((k<n)&&(tro==-1)) {
                if(x==v[k]) {
                        tro=k;
                   
        } else {
                        if(v[k]>x) {
                                k=n;
                           
            } else {
                                k++;
                           
            }
                   
        }
           
    }
        return tro;
}

int CercaOrdNonDisgInt(int v[],int n, int x) {
        //vettore ordinato a elementi non disgiunti
        int nx,k;
        nx=0;
        k=0;
        while(k<n) {
                    if(x==v[k]) {
                            printf("\nL'elemento trovato in posizione %d", k);
                            nx++;
                            k++;
                       
        } else {
                            if(v[k]>x) {
                                    k=n;//fa uscire dal ciclo
                               
            } else {
                                    k++;
                               
            }
                       
        }
           
    }
        return nx;//numero di occorrenze
}

int CercaBinariaNonRicorsivaInt(int v[],int n,int x) {
        int p,u,m,tro; // indice del... p= primo, u=ultimo, m=medio
        p =0;
        u =n-1;
        tro=-1;
        while((p<=u)&& tro==-1) {
                    m =(p+u)/2;
                if(v[m]==x) {
                        tro=m;
                   
        } else {
                        if(v[m]<x) {
                                p =m+1;
                           
            } else {
                  // x < v[m
                                u =m-1;
                           
            }
                   
        }
           
    }
        return tro;
}

void OrdinaVettRipplesortInt(int v[], int n) {
        int k, kmin, j;
        for(k=0; k<n-1; k++) {
                kmin= k;
                for(j=k; j<n; j++)
                        if(v[kmin] >v[j])
                                kmin = j;
                if(kmin != k)
                        scambioEleVettIndirInt(&v[k], &v[kmin]);
           
    }
        return;
}

void StampaVettInt(int v[], int n) {
            int k;
            for(k=0; k<n; k++) {
                    printf("Il %d valore e'   %d \n", k, v[k]);
               
    }
            return;
}

void OrdinaVettBubbleSort1Int(int vett[], int n) {
        int k, sup;
        for (sup = n-1; sup > 0; sup--) {
                for (k = 0; k < sup  ; k++) {
                        if (vett[k] > vett[k+1])
                                scambioEleVettIndirInt(&vett[k], &vett[k+1]);
                   
        }
           
    }
}

void OrdinaVettBubbleSort2Int(int vett[], int n) {
        int k, sup;
        bool sca;
        sup= n-1;
        sca= true;
        while ((sup>=1) && sca) {
                sca= false;
                for (k = 0; k<sup; k++) {
                        if (vett[k]> vett[k+1]) {
                                scambioEleVettIndirInt( &vett[k], &vett[k+1]);
                                sca=true;
                           
            }
                   
        }
                sup--;
           
    }
}

void OrdinaVettBubbleSort3Int(int vett[], int n) {
        int k, sup, sca;
        sup= n-1;
        while (sup>=1)
          {
                sca=0;
                for (k = 0; k < sup; k++) {
                        if (vett[k] > vett[k+1]) {
                                scambioEleVettIndirInt(&vett[k], &vett[k+1]);
                                sca=k;
                           
            }
                   
        }
                sup=sca;
           
    }
}


main() {

    int vett[DIM];
    int k;
    int tro;

    caricaVett(vett, DIM);

//menu
    printf("   Ordinamento ripplesort( 1)");
    printf("\n Ordinamento bubblesort (2)");
    printf("\n Ordinamento bubblesort2(3)");
    printf("\n Ordinamento bubblesort3(4)");
    scanf("%d",&k);

    switch(k) {
        case 1:
        OrdinaVettRipplesortInt(vett,DIM);
                    break;
        case 2:
        OrdinaVettBubbleSort1Int(vett,DIM);
                    break;
        case 3:
        OrdinaVettBubbleSort2Int(vett,DIM);
                    break;
        case 4:
        OrdinaVettBubbleSort3Int(vett,DIM);
                    break;
    }

    StampaVettInt(vett,DIM);
    printf("\n Inserire l'elemento da cercare: ");
    scanf("%d",&tro);
    k=0;

    printf("\n CercaOrdDisgInt            (1)");
    printf("\n CercaOrdNonDisgInt         (2)");
    printf("\n CercaBinariaNonRicorsivaInt(3)");

    scanf("%d",&k);

    switch(k) {
        case 1:
        k=CercaOrdDisgInt(vett,DIM,tro);
                    break;
        case 2:
        k=CercaOrdNonDisgInt(vett,DIM,tro);
                    break;
        case 3:
        k=CercaBinariaNonRicorsivaInt(vett,DIM,tro);
                    break;
    }
