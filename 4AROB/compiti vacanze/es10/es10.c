#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void caricoMatrice(int numeroRighe, int numeroColonne, int MAT[][numeroColonne]);
void controlloMatriceUnitaria(int numeroRighe, int numeroColonne, int MAT[][numeroColonne]);

int main() 
{
    int numeroRighe, numeroColonne;

    printf("Inserisci il numero di righe e di colonne: ");
    scanf("%d", &numeroRighe);

    numeroColonne = numeroRighe;

    int MAT[numeroRighe][numeroColonne];

    caricoMatrice(numeroRighe, numeroColonne, MAT);

    controlloMatriceUnitaria(numeroRighe, numeroColonne, MAT);

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

void controlloMatriceUnitaria(int numeroRighe, int numeroColonne, int MAT[][numeroColonne])
{
    int r = 0, c = 0, countZero = 0;
    bool unitaria = true;

     while(r < numeroRighe && unitaria == true)
     {
        if(MAT[r][c] == 1)
        {
            r++;
            c++;
        }
        else
        {
            printf("Non e' una matrice unitaria.\n");

            unitaria = false;
        }
     }

    for(r=0; (r < numeroRighe && unitaria == true); r++)
    {
        for(c=0; c < numeroColonne; c++)
        {
             if(MAT[r][c] == 0)
             {
                countZero++;
             }
        }

        if(countZero != numeroColonne-1)
        {
            unitaria = false;
        }

        countZero = 0;

    }

    if(unitaria == true)
    {
        printf("La mmatrice e' unitaria");
    }

}