#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct
{
    char Cognome[20];
    char nome[20];
    char sesso[2];
    char indirizzo[30];
    int telefono;
    int eta;
}Contatto;

void caricoRubrica(Contatto rubrica[], int nContatti);
void ordinamento(Contatto rubrica[], int nContatti);
int nuovoElemento(Contatto rubrica[], int nContatti);
void ricercaElemento(Contatto rubrica[], int nContatti);
void visualizzaTutto(Contatto rubrica[], int nContatti);
void statistiche(Contatto rubrica[], int nContatti);
void modificaDati(Contatto rubrica[], int nContatti);
void incrementoEta(Contatto rubrica[], int nContatti);

int main()
{
    Contatto rubrica[30];
    int nContatti;

    printf("\nQuanti contatti vuoi inserire?: ");
    scanf("%d", &nContatti);

    caricoRubrica(rubrica, nContatti);
    ordinamento(rubrica, nContatti);

    int scelta;

    do
    {
        printf("0) Uscita dal programma.\n");
        printf("1) Inserisci un nuovo elemento con caricamento ordinato.\n");
        printf("2) Cerca elemento all'interno della rubrica.\n");
        printf("3) Visualizza rubrica.\n");
        printf("4) Statistiche eta'.\n");
        printf("5) Modifica dati di un elemento.\n");
        printf("6) Incremento di eta' (nuovo anno).\n");
        scanf("%d", &scelta);

        switch(scelta)
        {
            case 0:
                printf("Il programma verra' arrestato.\n");
                break;
            case 1:
                 nContatti = nuovoElemento(rubrica, nContatti);
                 ordinamento(rubrica, nContatti);
                break;
            case 2:
                ricercaElemento(rubrica, nContatti);
                break;
            case 3:
                visualizzaTutto(rubrica, nContatti);
                break;
            case 4:
                statistiche(rubrica, nContatti);
                break;
            case 5:
                modificaDati(rubrica, nContatti);
                ordinamento(rubrica, nContatti);
                break;
            case 6:
                incrementoEta(rubrica, nContatti);
                break;
            default:
                printf("Hai inserito un valore non valido, reintroducilo.\n");
        }
    }while(scelta != 0);


    return 0;
}

void caricoRubrica(Contatto rubrica[], int nContatti)
{
    int i;

    for(i=0; i < nContatti; i++)
    {
        fflush(stdin);

        printf("\n");

        printf("Inserisci il cognome: ");
        fgets(rubrica[i].Cognome, sizeof rubrica[i].Cognome, stdin);

        if(rubrica[i].Cognome[strlen(rubrica[i].Cognome)-1] == '\n')
        {
            rubrica[i].Cognome[strlen(rubrica[i].Cognome)-1] = '\0';
        }

        printf("Inserisci il nome: ");
        fgets(rubrica[i].nome, sizeof rubrica[i].nome, stdin);

        if(rubrica[i].nome[strlen(rubrica[i].nome)-1] == '\n')
        {
            rubrica[i].nome[strlen(rubrica[i].nome)-1] = '\0';
        }

        printf("Inserisci il sesso (F o M): ");
        fgets(rubrica[i].sesso, sizeof rubrica[i].sesso, stdin);

        if(rubrica[i].sesso[strlen(rubrica[i].sesso)-1] == '\n')
        {
            rubrica[i].sesso[strlen(rubrica[i].sesso)-1] = '\0';
        }

        fflush(stdin);

        printf("Inserisci l'indirizzo: ");
        fgets(rubrica[i].indirizzo, sizeof rubrica[i].indirizzo, stdin);

        if(rubrica[i].indirizzo[strlen(rubrica[i].indirizzo)-1] == '\n')
        {
            rubrica[i].indirizzo[strlen(rubrica[i].indirizzo)-1] = '\0';
        }

        printf("Inserisci il numero di telefono: ");
        scanf("%d", &rubrica[i].telefono);

        printf("Inserisci l' eta': ");
        scanf("%d", &rubrica[i].eta);
    }

}

void ordinamento(Contatto rubrica[], int nContatti)
{
    int i, j;

    for(i = 0; i < nContatti - 1; i++)
    {
        for (j = nContatti - 1; j > i; j--)
        {
           if (strcmp(rubrica[j].Cognome, rubrica[j-1].Cognome) < 0)
            {
                 Contatto temp; 
                temp = rubrica[j-1]; 
                rubrica[j-1] = rubrica[j]; 
                rubrica[j] = temp; 

            } 
        } 
    } 
} 

int nuovoElemento(Contatto rubrica[], int nContatti) 
{ 
    int i = nContatti;  

    nContatti = nContatti + 1; 

    fflush(stdin); 

    printf("\n"); 

    printf("Inserisci il cognome: "); 
    fgets(rubrica[i].Cognome, sizeof rubrica[i].Cognome, stdin); 

    if(rubrica[i].Cognome[strlen(rubrica[i].Cognome)-1] == '\n') 
    { 
        rubrica[i].Cognome[strlen(rubrica[i].Cognome)-1] = '\0'; 
    } 

    printf("Inserisci il nome: "); 
    fgets(rubrica[i].nome, sizeof rubrica[i].nome, stdin); 

    if(rubrica[i].nome[strlen(rubrica[i].nome)-1] == '\n') 
    { 
        rubrica[i].nome[strlen(rubrica[i].nome)-1] = '\0'; 
    } 

    printf("Inserisci il sesso (F o M): "); 
    fgets(rubrica[i].sesso, sizeof rubrica[i].sesso, stdin); 

    if(rubrica[i].sesso[strlen(rubrica[i].sesso)-1] == '\n') 
    { 
        rubrica[i].sesso[strlen(rubrica[i].sesso)-1] = '\0'; 
    } 

    fflush(stdin); 

    printf("Inserisci l'indirizzo: "); 
    fgets(rubrica[i].indirizzo, sizeof rubrica[i].indirizzo, stdin); 

    if(rubrica[i].indirizzo[strlen(rubrica[i].indirizzo)-1] == '\n') 
    { 
        rubrica[i].indirizzo[strlen(rubrica[i].indirizzo)-1] = '\0'; 
    } 

    printf("Inserisci il numero di telefono: "); 
    scanf("%d", &rubrica[i].telefono); 

    printf("Inserisci l' eta': "); 
    scanf("%d", &rubrica[i].eta); 

    return nContatti; 
} 

void ricercaElemento(Contatto rubrica[], int nContatti) 
{ 
    printf("\nRicerca elemento nella rubrica.\n"); 

    int i; 
    char cg[20], nm[20]; 

    fflush(stdin); 
    printf("\nInserisci il cognome: "); 
    fgets(cg, sizeof cg, stdin); 

    if(cg[strlen(cg)-1] == '\n') 
    { 
        cg[strlen(cg)-1] = '\0'; 
    } 

    printf("Inserisci il nome: "); 
    fgets(nm, sizeof nm, stdin); 

    if(nm[strlen(nm)-1] == '\n') 
    { 
        nm[strlen(nm)-1] = '\0'; 
    } 

    for(i=0; i < nContatti; i++) 
    { 
        if(strcmp(rubrica[i].Cognome, cg) == 0) 
        { 
            if(strcmp(rubrica[i].nome, nm) == 0) 
            { 
                printf("\nCognome: %s", rubrica[i].Cognome); 
                printf("\nNome: %s", rubrica[i].nome); 
                printf("\nSesso: %s", rubrica[i].sesso); 
                printf("\nindirizzo: %s", rubrica[i].indirizzo); 
                printf("\nTelefono: %d", rubrica[i].telefono); 
                printf("\nEta': %d", rubrica[i].eta); 
                printf("\n"); 
            } 
        } 
    } 
} 

void visualizzaTutto(Contatto rubrica[], int nContatti) 
{ 
    int i; 

    for(i=0; i < nContatti; i++) 
    { 
        printf("\n"); 
        printf("\nCognome: %s", rubrica[i].Cognome); 
        printf("\nNome: %s", rubrica[i].nome); 
        printf("\nSesso: %s", rubrica[i].sesso); 
        printf("\nindirizzo: %s", rubrica[i].indirizzo); 
        printf("\nTelefono: %d", rubrica[i].telefono); 
        printf("\nEta': %d", rubrica[i].eta); 
        printf("\n"); 
    } 
} 

void statistiche(Contatto rubrica[], int nContatti) 
{ 
    int i; 
    int sommaMaschi = 0, maschi = 0, mediaMaschi = 0; 
    int sommaFemmine = 0, femmine = 0, mediaFemmine = 0; 
    char m[2] = {'m','\0'}; 

    for(i=0; i < nContatti; i++) 
    { 
        if(strcmp(rubrica[i].sesso, m) == 0) 
        { 
            sommaMaschi = sommaMaschi + rubrica[i].eta; 
            maschi++; 
        } 
        else 
        { 
            sommaFemmine = sommaFemmine + rubrica[i].eta; 
            femmine++; 
        } 
    } 

    if(maschi == 0) 
    { 
        printf("Non sono presenti maschi nella rubrica."); 
    } 
    else 
    { 
        mediaMaschi = sommaMaschi/maschi; 
         printf("La media delle eta' dei maschi e': %d", mediaMaschi); 
    } 

     if(femmine == 0) 
     { 
        printf("\nNon sono presenti femmine nella rubrica.\n"); 
     } 
     else 
     { 
             {  
        mediaFemmine = sommaFemmine/femmine; 
        printf("\nLa media delle eta' delle femmine e': %d", mediaFemmine); 
     } 
} 

void modificaDati(Contatto rubrica[], int nContatti) 
{ 
    printf("\nModifica dati.\n"); 

    int i; 
    char cg[20], nm[20]; 

    fflush(stdin); 
    printf("\nInserisci il cognome della persona da modificare i dati: "); 
    fgets(cg, sizeof cg, stdin); 

    if(cg[strlen(cg)-1] == '\n') 
    { 
        cg[strlen(cg)-1] = '\0'; 
    } 

    printf("Inserisci il nome: "); 
    fgets(nm, sizeof nm, stdin); 

    if(nm[strlen(nm)-1] == '\n') 
    { 
        nm[strlen(nm)-1] = '\0'; 
    } 

    for(i=0; i < nContatti; i++) 
    { 
        if(strcmp(rubrica[i].Cognome, cg) == 0) 
        { 
            if(strcmp(rubrica[i].nome, nm) == 0) 
            { 
                printf("Inserisci il cognome: "); 
                fgets(rubrica[i].Cognome, sizeof rubrica[i].Cognome, stdin); 

                if(rubrica[i].Cognome[strlen(rubrica[i].Cognome)-1] == '\n') 
                { 
                    rubrica[i].Cognome[strlen(rubrica[i].Cognome)-1] = '\0'; 
                } 

                printf("Inserisci il nome: "); 
                fgets(rubrica[i].nome, sizeof rubrica[i].nome, stdin); 

                if(rubrica[i].nome[strlen(rubrica[i].nome)-1] == '\n') 
                { 
                    rubrica[i].nome[strlen(rubrica[i].nome)-1] = '\0'; 
                } 

                printf("Inserisci il sesso (F o M): "); 
                fgets(rubrica[i].sesso, sizeof rubrica[i].sesso, stdin); 

                if(rubrica[i].sesso[strlen(rubrica[i].sesso)-1] == '\n') 
                { 
                    rubrica[i].sesso[strlen(rubrica[i].sesso)-1] = '\0'; 
                } 

                fflush(stdin); 

                printf("Inserisci l'indirizzo: "); 
                fgets(rubrica[i].indirizzo, sizeof rubrica[i].indirizzo, stdin); 

                if(rubrica[i].indirizzo[strlen(rubrica[i].indirizzo)-1] == '\n') 
                { 
                    rubrica[i].indirizzo[strlen(rubrica[i].indirizzo)-1] = '\0'; 
                } 

                printf("Inserisci il numero di telefono: "); 
                scanf("%d", &rubrica[i].telefono); 

                printf("Inserisci l' eta': "); 
                scanf("%d", &rubrica[i].eta); 
            } 
        } 
    } 
} 

void incrementoEta(Contatto rubrica[], int nContatti) 
{ 
    int i; 

    for(i=0; i < nContatti; i++) 
    { 
        rubrica[i].eta = rubrica[i].eta + 1; 
    } 

    printf("\n Gli anni sono stati incrementati.\n"); 
} 
