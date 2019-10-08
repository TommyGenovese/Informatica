#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define RIGA 500
#define NAME 20

main(){

    char fileName[NAME]= "poesia.txt";
    char newName[NAME]= "nuovo.txt";
    char riga[RIGA];
    int k=0;
    FILE *fp;
    FILE *fp1;

    fp = fopen(fileName, "r");
    fp1 = fopen(newName, "w");
    if(fp == NULL){
        printf("file non esistente");
    }else{
        while(fgets(riga, RIGA, fp)!=NULL){
            if(k%2==0){
                fprintf(fp1,"%s", riga);
            }
            k++;
        }
        fclose(fp);
        fclose(fp1);
        remove("poesia.txt");
        rename("nuovo.txt", "poesia.txt");

    }


}
