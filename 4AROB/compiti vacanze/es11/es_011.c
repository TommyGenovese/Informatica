#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void caricoValoriMatrice(int numeroRighe, int numeroColonne, int MAT[][numeroColonne]);
void controlloMatrice(int numeroRighe, int numeroColonne, int MAT[][numeroColonne]);

int main() 
{
    int numeroRighe, numeroColonne;

    printf("Inserisci il numero di righe della matrice: ");
    scanf("%d", &numeroRighe);

    printf("Inserisci il numero di colonne della matrice: ");
    scanf("%d", &numeroColonne);

    int MAT[numeroRighe][numeroColonne];

    caricoValoriMatrice(numeroRighe, numeroColonne, MAT);

    controlloMatrice(numeroRighe, numeroColonne, MAT);

    return 0;
}

void caricoValoriMatrice(int numeroRighe, int numeroColonne, int MAT[][numeroColonne])
{
    int r, c;

    for(r=0; r < numeroRighe; r++)
    {
        printf("\n");

        for(c=0; c < numeroColonne; c++)
        {
            printf("Inserisci il valore nella cella %d, %d della matrice: ", r, c);
            scanf("%d", &MAT[r][c]);
        }
    }

     printf("La matrice e': \n");

     for(r=0; r<numeroRighe; r++)
    {
        printf("\n");

        for(c=0; c<numeroColonne; c++)
        {
            printf("%d", MAT[r][c]);
        }
    }

     printf("\n");

}

void controlloMatrice(int numeroRighe, int numeroColonne, int MAT[][numeroColonne])
{
   int r, c, maggiore, ordinataRighe = 0, ordinataColonne = 0, a = 0, b = 0;
   bool crescente = false, decrescente = false, crescenteColonne = false, decrescenteColonne = false;

    if (MAT[a][b] == MAT[a][b+1])
    {
        while(crescente == false && decrescente == false)
        {
           if(MAT[a][b] < MAT[a][b+1])
            {
                crescente = true;
            }

            if(MAT[a][b] > MAT[a][b+1])
            {
                decrescente = true;
            }

            b++;
        }
    }
    else
    {
        if(MAT[a][b] < MAT[a][b+1])
        {
            crescente = true;
        }
        else
        {
           decrescente = true;
        }
    }

    a = 0;
    b = 0;

    if (MAT[a][b] == MAT[a+1][b])
    {
        while(crescenteColonne == false && decrescenteColonne == false)
        {
            if(MAT[a][b] < MAT[a+1][b])
            {
                crescenteColonne = true;
            }

            if(MAT[a][b] > MAT[a+1][b])
            {
                decrescenteColonne = true;
            }

            a++;
        }
    }
    else
    {
         if(MAT[a][b] < MAT[a+1][b])
         {
            crescente = true;
         }
         else
         {
           decrescente = true;
         }
    }

    if(numeroColonne > numeroRighe)
    {
        maggiore = numeroColonne;
    }
    else
    {
        maggiore = numeroRighe;
    }

    while(a < maggiore && b < maggiore)
    {
        r = a;

        if(a < numeroRighe)
        {
            for(c=0; c < numeroColonne-1; c++)
            {
                if(crescente == true)
                {
                    if(MAT[r][c] <= MAT[r][c+1])
                    {
                        ordinataRighe++;
                    }
                    else
                    {
                        ordinataRighe = 0;
                    }
                }

                if(decrescente == true)
                {
                    if(MAT[r][c] >= MAT[r][c+1])
                    {
                        ordinataRighe++;
                    }
                    else
                    {
                        ordinataRighe = 0;
                    }
                }
            }
        }

        c = b;

        if (b < numeroColonne)
        {
             for(r=0; r < numeroRighe-1; r++)
            {
                if(crescenteColonne == true)
                {
                    if(MAT[r][c] <= MAT[r+1][c])
                    {
                        ordinataColonne++;
                    }
                    else
                    {
                       ordinataColonne = 0;
                    }
                }

                if(decrescenteColonne == true)
                {
                if(decrescenteColonne == true) 
                { 
                    if(MAT[r][c] >= MAT[r+1][c]) 
                    { 
                        ordinataColonne++; 
                    } 
                    else 
                    { 
                        ordinataColonne = 0; 
                    } 
                } 
            } 
        } 

        a++; 
        b++;  
    } 

    if(ordinataRighe == (numeroColonne - 1) * numeroColonne) 
    { 
        printf("La matrice e' ordinata per righe.\n"); 
    } 

    if(ordinataColonne == numeroColonne) 
    { 
        printf("La matrice e' ordinata per colonne.\n"); 
    } 
} 
