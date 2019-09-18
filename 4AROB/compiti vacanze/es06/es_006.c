#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main()
{
    char parola[20];
    int i, a = 0; 

    printf("Inserisci la parola: ");
    fgets(parola, sizeof parola, stdin);

    if(parola[strlen(parola)-1] == '\n')
    {
        parola[strlen(parola)-1] = '\0';
    }

    for(i=0; i < strlen(parola); i++)
    {
        if(parola[i] == 'a' || parola[i] == 'e' || parola[i] == 'i' || parola[i] == 'o' || parola[i] == 'u')
        {
           for(a=i; a < strlen(parola); a++)
           {
               parola[a] = parola[a+1];
           }

           i--;
        }

    }
    printf("%s", parola);

    return 0;
}