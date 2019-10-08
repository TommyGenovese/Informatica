/*
    Creare un programma che metta in ordine un array di stringhe, e che dato un nome dall'utente lo ricerchi nell'elenco.
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>

#define NAME 20 //grandezza massima del nome
#define NUM 50  //numero massimo di nome

void caricaLista(char m[][NAME], int *t);
void ordinaLista(char m[][NAME], int t);
void visualizzaLista(char [][NAME], int t);
void cercaNome(char m[][NAME], int t);

main(){
    char list[NUM][NAME];
    int names;

    caricaLista(list,&names);
    ordinaLista(list,names);
    visualizzaLista(list,names);
    cercaNome(list,names);
}

void caricaLista(char m[][NAME], int *t){
    int tot;
    do{
        printf("Nomi totali: ");
        scanf("%d" , &tot);
        system("cls");

    }while(tot<=0 || tot>NUM);
    for(int k = 0; k<tot;k++){
        printf("nome [%d]: " , k);
        fflush(stdin);
        gets(m[k]);
    }

    *t = tot;
    system("cls");
}

void ordinaLista(char m[][NAME], int t){
    int k,i;
    char name[NAME];

    for(k=0;k<t;k++){
        for(i=k;i<t;i++){
            if(strcmp(m[i+1],m[i])<0){
                strcpy(name,m[i]);
                strcpy(m[i],m[i+1]);
                strcpy(m[i+1],name);
            }
        }
    }

    printf("\nLista ordinata. Premi invio per visualizzarla.\n");
    getch();
    system("cls");
}

void visualizzaLista(char m[][NAME], int t){
    for(int k = 0; k < t; k++){
        printf("nome [%d]: %s\n" , k, m[k]);
    }
}

void cercaNome(char m[][NAME], int t){
    char name[NAME];    //nome da trovare
    bool found = false; //true se trovo il nome
    int k=0;

    printf("Nome da cercare: ");
    fflush(stdin);
    gets(name);

    while( k<t || !found){
        if(strcmp(m[k],name)==0){
            found = true;
            printf("\nNome %s trovato. Posizione [%d]." , name, k);
        }
        k++;
    }
}
