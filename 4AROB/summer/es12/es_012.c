#include <stdio.h>
#include <stdlib.h>

void caricoMatriceMAT(int numeroRighe, int numeroColonne, int NUM[][numeroColonne]);
void controlloInput(int numeroRighe, int numeroColonne, int MAT[][numeroColonne]);

int main()
{
    int numeroRighe, numeroColonne;

    printf("Inserisci il numero di righe: ");
    scanf("%d", &numeroRighe);

    printf("Inserisci il numero di colonne: ");
    scanf("%d", &numeroColonne);

    int NUM[numeroRighe][numeroColonne];

    caricoMatriceMAT(numeroRighe, numeroColonne, NUM);

    return 0; 
}

void caricoMatriceMAT(int numeroRighe, int numeroColonne, int NUM[][numeroColonne])
{
    int r, c, a = 0, b = 0;

    int MAT[numeroRighe][numeroColonne];

    for(r=0; r < numeroRighe; r++)
    {
        printf("\n");

        for(c=0; c < numeroColonne; c++)
        {
            printf("Inserisci il numero nella cella del vettore %d, %d: ", r, c);
            scanf("%d", &NUM[r][c]);
        }
    }

    for(r=0; r < numeroRighe; r++)
    {
        for(c=0; c < numeroColonne; c++)
        {
           MAT[a][b] = NUM[r][c];

           if(a == numeroRighe-1)
           {
               a = 0;
               b++;
           }
           else
           {
              a++;
           }
        }
    }

    controlloInput(numeroRighe, numeroColonne, MAT);

}

void controlloInput(int numeroRighe, int numeroColonne, int MAT[][numeroColonne])
{
    int r, c, numeroInserito, resto = 0;

    printf("\nInserisci il numero: ");
    scanf("%d", &numeroInserito);

    for(r=0; r < numeroRighe; r=r+2)
    {
        for(c=0; c < numeroColonne; c++)
        {
            resto = MAT[r][c] % numeroInserito;

            if(resto == 0)
            {
                printf("\nIl numero %d della riga %d e' multiplo di %d.\n", MAT[r][c], r, numeroInserito);
            }
        }
    }
}