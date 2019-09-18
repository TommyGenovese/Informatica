#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char parola[20];
    int i, p = 0;

    printf("Inserisci la parola: ");
    fgets(parola, sizeof parola, stdin);

    if(parola[strlen(parola)-1] == '\n')
    {
        parola[strlen(parola)-1] = '\0';
    }

    char vocali[40];

    for(i=0; i < strlen(parola); i++)
    {
        if(parola[i] == 'a' || parola[i] == 'e' || parola[i] == 'i' || parola[i] == 'o' || parola[i] == 'u')
        {
            vocali[p] = parola[i];
            vocali[p+1] = parola[i];

            p = p + 2;
        }
        else {
            vocali[p] = parola[i];
            p++;
        }
    }

     if(vocali[strlen(vocali)-1] == '\n')
     {
        vocali[strlen(vocali)-1] = '\0';
     }

    printf("%s", vocali);

    return 0;
} 