#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>

#define NAME 10
#define NUM 100

typedef struct stato{
    char name[NAME];
    char capit[NAME];
    int km2;
    int abitant;
}State;


int caricaTab_File(State t[], int n, char nf[]){
    FILE *fp;
    int k=0;
    fp=fopen(nf,"r");

    if(fp==NULL){
        printf("File %s inesistente. Premi per terminare.", nf);
        system("cls");
    }else{
        while (k<n && fscanf(fp,"%s %s %d %d", t[k].name, t[k].capit, &t[k].km2, &t[k].abitant)!=EOF){
            k++;
        }
        printf("Tabella caricata\nPremi per continuare.\n");
        system("cls");
    }

    fclose(fp);
    return k;
}

void ordinaLista(State t[], int n){
    State support;
    for(int i=0; i<n; i++){
        for(int k=0; k<n-i-1; k++){
            if(strcmp(t[k+1].name,t[k].name)<0){
                support = t[k+1];
                t[k+1]=t[k];
                t[k] = support;
			}
		}
	}
}

void visLista(State t[], int n){
    for (int i = 0; i < n; i++){
        printf("|stato:\t\t%s\t|\n|capitale:\t%s\t|\n|superficie:\t%d\t|\n|abitanti:\t%d\t|\n|densita':\t%.2f\t|\n" ,
                t[i].name, t[i].capit, t[i].km2, t[i].abitant, (float)t[i].abitant /t[i].km2);
        printf("______________________________\n");
    }
}

main(){
    int nState =0;
    State list[NUM];
    char fileN[NAME] = "file.txt";

    nState = caricaTab_File(list, NUM, fileN);

    ordinaLista(list, nState);

    visLista(list,nState);
}

