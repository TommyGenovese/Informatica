#include <stdio.h>
#include <stdlib.h>
 
void caricoMatrice(int numeroRighe, int numeroColonne, int MAT[][numeroColonne]);

void sommaElementi(int numeroRighe, int numeroColonne, int MAT[][numeroColonne]);

int main()
{
    int numeroRighe, numeroColonne;

    printf("Inserisci il numero di righe: ");
    scanf("%d", & numeroRighe);

    printf("Inserisci il numero di colonne: ");
    scanf("%d", & numeroColonne);

    int MAT[numeroRighe][numeroColonne];

    caricoMatrice(numeroRighe, numeroColonne, MAT);

    sommaElementi(numeroRighe, numeroColonne, MAT);

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
}

void sommaElementi(int numeroRighe, int numeroColonne, int MAT[][numeroColonne])
{
    int r = 0, c = 0, sommaUno = 0, sommaDue = 0;

    for(r=0; r < numeroRighe-1; r++)
    {
        sommaUno += MAT[r+1][r];
    }

    c = numeroColonne -1;

    for(r=1; r < numeroRighe; r++)
    {
        sommaDue += MAT[r][c];
        c--;
    }

    printf("Somma diagonale principale: %d\n", sommaUno);
    printf("Somma diagonale secondaria: %d\n", sommaDue);
}