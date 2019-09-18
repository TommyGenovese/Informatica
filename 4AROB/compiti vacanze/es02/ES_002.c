#include<stdio.h>
#include<stdlib.h>
#include <stdbool.h>

#define MAX 50

int chiediDim(int max) {
    int size;
    do {
        printf("Inserisci quanti elementi vuoi nel vettore: (max = %d)\n", max);
        scanf("%d", &size);
        system("cls");
    } while(size<=0 || size > max);
}

void vettoreCasuale(int v[], int max, int min, int grandVett) {
    srand(time(NULL));
    for(int k = 0; k < grandVett; k++) {

        v[k] = (rand()%(max - min +1)) + min;
    }

}

void visVett(int v[], int s) {
    for(int k = 0; k < s; k++) {
        printf("[%d] = %d\n", k, v[k]);
    }
}

int somElem(int v[], int s) {
    int tot = 0;
    for(int k = 0; k < s; k++) {
        tot += v[k];
    }

    return tot;
}

float mediaElem(int v[], int s) {
    float med = 0;
    for(int k = 0; k < s; k++) {
        med += v[k];
    }
    if(s != 0) med /= s;

    return (med);
}

void minMax(int v[], int s) {
    int min, max;
    max = v[0];
    for(int k = 1; k<s; k++) {
        if(v[k]>max) max=v[k];

        if(v[k]< min) min = v[k];

    }
    printf("min = %d , max = %d", min, max);
}
bool tutPos(int v[], int s) {
    bool all = true;
    int k=0;
    while(k<s && all) {
        if(v[k]<=0) all=false;
        k++;
    }
    return all;
}
void posNegSum(int v[], int s) {
    int sp= 0,sn = 0;
    for(int k = 0; k < s; k++) {
        if(v[k]>0) sp += v[k];
        else sn += v[k];
    }

    sn = -sn;

    if(sn > sp) {
        printf("Somma negativi maggiore (n: %d p: %d)\n", sn, sp);
    } else {
        if(sn<sp) {
            printf("Somma positivi maggiore (n: %d p: %d)\n", sn, sp);
        } else {
            printf("somma pari (n: %d p: %d)\n", sn, sp);
        }
    }
}


main() {

    int risp;
    bool caricato = false;
    int grandVett;
    int v[MAX];

    do {

        printf("\n0 = esci\n1  =  carica  il vettore  con  valori  casuali  da -20  a  20,  dopo  aver  chiesto quanti elementi si vogliono inserire\n2 = visualizza il vettore\n3 = somma di tutti gli elementi\n4 = media degli elementi\n5 = visualizza valore minimo e massimo\n6 = gli elementi sono tutti positivi?\n7 = somma degli elementi positivisomma degli elementi negativiquale somma è maggiore in valore assoluto?\n");
        scanf("%d", &risp);
        system("cls");

        switch(risp) {
        case 0:
            break;
        case 1:
            grandVett = chiediDim(MAX);
            vettoreCasuale(v,20,-20, grandVett);
            caricato = true;
            visVett(v, grandVett);
            break;

        case 2:
            if(caricato) {
                visVett(v, grandVett);
            } else {
                printf("vettore non caricato!\n");
            }
            break;

        case 3:
            if(caricato) {
                printf("La somma degli elementi e' = %d\n", somElem(v,grandVett));
            } else {
                printf("vettore non caricato!\n");
            }
            break;

        case 4:
            if(caricato) {
                printf("media = %.2f\n", mediaElem(v,grandVett));
            } else {
                printf("vettore non caricato!\n");
            }
            break;

        case 5:
            if(caricato) {
                minMax(v,grandVett);
            } else {
                printf("vettore non caricato!\n");
            }
            break;

        case 6:
            if(caricato) {
                if(tutPos(v,grandVett) == true) {
                    printf("sono tutti positivi\n");
                } else {
                    printf("non sono tutti positivi\n");
                }
            } else {
                printf("vettore non caricato!\n");
            }
            break;

        case 7:
            if(caricato) {
                posNegSum(v,grandVett);
            } else {
                printf("vettore non caricato!\n");
            }
            break;

        default:
            break;
        }
    } while(risp!= 0);

}

