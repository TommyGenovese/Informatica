#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct
{
    char nomeSquadra[20];
    int codiceSquadra;
    int goalFatti;
    int goalSubiti;
}Squadra;

void array(Squadra squadre[], int nSquadre);
void goal(Squadra squadre[], int nSquadre);
void codiceSquadre(Squadra squadre[], int nSquadre);

int main()
{
    int scelta, nSquadre;

    printf("Quante squadre vuoi inserire?: ");
    scanf("%d", &nSquadre);

    Squadra squadre[nSquadre];
    do 
    {
        printf("1) Inserisce le strutture della squadre in un array.\n");
        printf("2) Stampa le squadre che hanno il numero di goal fatti maggiore a quello dei subiti.\n");
        printf("3) Dato il codice, stampa il nome, gial fatti e subiti della squadra.\n");
        printf("99)Uscita dal programma.\n");
        scanf("%d", &scelta);

        switch(scelta)
        {
            case 1:
                array(squadre, nSquadre);
                break;
            case 2:
                goal(squadre, nSquadre);
                break;
            case 3:
                codiceSquadre(squadre, nSquadre);
                break;
            case 99:
                printf("Il programma verra' arrestato.\n");
                break;
            default:
                printf("Hai inserito un valore non valido, reintroducilo.\n");
        }
    }while(scelta != 99);

    return 0;
}

void array(Squadra squadre[], int nSquadre)
{
    int i;

    for(i=0; i < nSquadre; i++)
    {
        fflush(stdin);
        printf("\n");

       printf("\nInserisci il nome della Squadra: ");
       fgets(squadre[i].nomeSquadra, sizeof squadre[i].nomeSquadra, stdin);

       if(squadre[i].nomeSquadra[strlen(squadre[i].nomeSquadra)- 1] == '\n')
       {
           squadre[i].nomeSquadra[strlen(squadre[i].nomeSquadra)- 1] = '\0';
       }

       printf("Inserisci il codice della squadra: ");
       scanf("%d", &squadre[i].codiceSquadra);

       printf("Inserisci i goal fatti: ");
       scanf("%d", &squadre[i].goalFatti);

       printf("Inserisci i goal subiti: ");
       scanf("%d", &squadre[i].goalSubiti);

       printf("\n");
    }
}

void goal(Squadra squadre[], int nSquadre)
{
    int i;

    for(i=0; i < nSquadre; i++)
    {
        if(squadre[i].goalFatti > squadre[i].goalSubiti)
        {
            printf("\nLa squadra %s ha un numero di goal fatti maggiore di quelli subiti(%d a %d).\n", squadre[i].nomeSquadra, squadre[i].goalFatti, squadre[i].goalSubiti);
            printf("\n");
        }
    }
}

void codiceSquadre(Squadra squadre[], int nSquadre)
{
    int codice, i;

    printf("\nInserisci il codice della squadra di cui vuoi guardare le statistiche: ");
    scanf("%d", &codice);

    for(i=0; i < nSquadre; i++)
    {
        if(squadre[i].codiceSquadra == codice)
        {
            printf("\nNome: %s", squadre[i].nomeSquadra);
            printf("\nGoal fatti: %d", squadre[i].goalFatti);
            printf("\nGoal subiti: %d\n", squadre[i].goalSubiti);
            printf("\n");
        }
    }
}