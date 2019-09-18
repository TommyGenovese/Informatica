#include<stdlib.h>
#include<stdio.h>

#define NPART 6
#define NPROVE 20
#define NOME 10

typedef struct partecipante{
    char nome[NOME];
    int punteg[NPROVE];
}Partec;

void caricaPartec(int part, int prove, char doc[], Partec concor[], FILE *fp){
    int k=0;
    if(fp==NULL){
        printf("non esiste il file");
        return fp;
    }else{
        while(fscanf(fp, "%s", concor[k].nome) != EOF){
            for(int i=0; i<prove; i++){
                fscanf(fp, "%d", concor[k].punteg[i]);
            }
            k++;
        }
    }
    fclose(fp);
}

void confrontaPart(int prove, Partec concor[NPART]){
    int k, i;
    int max=0;
    char migliore[NOME];
    for(i=0; i<prove; i++){
        max= concor[0].punteg[i];
        for(k=1; k<=NPART; k++){
            if(concor[k].punteg[i]>max){
                max=concor[k].punteg[i];
                migliore[NOME]=concor[k].nome;
            }
        }
        printf("il vincitore della prova %d e' %s, con un punteggio di %d", i+1, migliore, max);
    }
}

int main(){

    char doc[]= "documento.txt";
    Partec concor[NPART];

    FILE *fp;
    fp = fopen(doc, "r");

    caricaPartec(NPART, NPROVE, doc, concor, fp);
    confrontaPart(NPROVE, concor);

}
