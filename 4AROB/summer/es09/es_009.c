#include <stdio.h>
#include <stdlib.h>

void caricoMatrice(int numeroRighe, int numeroColonne, int MAT[][numeroColonne]);
void trasposta(int numeroRighe, int numeroColonne, int MAT[][numeroColonne]);

int main() 
{
    int numeroRighe, numeroColonne;

    printf("Inserisci il numero di righe: ");
    scanf("%d", &numeroRighe);

    printf("Inserisci il numero di colonne: ");
    scanf("%d", &numeroColonne);

    int MAT[numeroRighe][numeroColonne];

    caricoMatrice(numeroRighe, numeroColonne, MAT);

    trasposta(numeroRighe, numeroColonne, MAT);

    return 0;
}

void caricoMatrice(int numeroRighe, int numeroColonne, int MAT[][numeroColonne])
{
    int r, c;

    for(r=0; r < numeroRighe; r++)
    {
        printf("\n");

        for(c=0; c < numeroColonne; c++)
        {
            printf("Inserisci il numero nella cella della matrice %d, %d: ", r, c);
            scanf("%d", &MAT[r][c]);
        }
    }

    printf("\nQuesta e' la matrice: \n");

    for(r=0; r < numeroRighe; r++)
    {
        printf("\n");

        for(c=0; c < numeroColonne; c++)
        {
            printf("%d", MAT[r][c]);
        }
    }
}

void trasposta(int numeroRighe, int numeroColonne, int MAT[][numeroColonne])
{
    int r, c;

    int trasposta[numeroColonne][numeroRighe];

    for(r=0; r < numeroRighe; r++)
    {
        for(c=0; c < numeroColonne; c++)
        {
            trasposta[c][r] = MAT[r][c];
        }
    }

    printf("\nLa matrice trasposta e': \n");

    for(r=0; r < numeroColonne; r++)
    {
        printf("\n");

        for(c=0; c < numeroRighe; c++)
        {
            printf("%d", trasposta[r][c]);
        }
    }

}