#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_NAT 20
#define MAX_STRING_LENGTH 100

// Store the data about a nation
typedef struct _Nation {
    char name[MAX_STRING_LENGTH];
    char cap[MAX_STRING_LENGTH];
    int surface;
    int ab;
} Nation;

int get_input(Nation nats[], FILE *inp) {
    // Get input from the file to an array of struct
    int i = 0;
    while (i < MAX_NAT && fscanf(inp, "%s %s %d %d", nats[i].name, nats[i].cap, &nats[i].surface, &nats[i].ab) != EOF) i += 1;
    return i;
}

// Compare, used for qsort and bsearch
int cmp(void *a, void *b) {
    return strcmp(((Nation*)a)->name, ((Nation*)b)->name);
}

void put_output(Nation nats[], FILE *f, int length) {

    // Output sorted data to the file
    for (int i = 0; i < length; i++) {
        fprintf(f, "%s %s %d %d\n", nats[i].name, nats[i].cap, nats[i].surface, nats[i].ab);
    }

    return;
}

int main(void) {

    int ret_flag = 0;
    const char *path = "./input.txt"; // Path of the input-output file

    // Opening the file and checking its existance
    FILE *f = fopen(path, "r");
    if (f != NULL) {

        // Array of struct , containing all the nations
        Nation nations[MAX_NAT];

        // Getting input from file
        int length = get_input(nations, f);

        // Sorting using qsort
        qsort(nations, length, sizeof(nations[0]), cmp);

        // Writing to the file in the correct order
        fclose(f);
        f = fopen(path, "w");
        if (f != NULL) {
            put_output(nations, f, length);
            
            // Search and display through bin search
            char name[MAX_STRING_LENGTH];
            printf("Data loaded and saved.\nEnter the name of the nation to search: ");
            scanf("%s", name);
            void *result = bsearch(name, nations, length, sizeof(nations[0]), cmp);
            if (result == NULL) printf("[%s]: Citta\' non trovata.\n", name);
            else printf("[%s]: Citta\' trovata:\n\tName: %s\n\tCapital: %s\n\tSurface: %d km2\n\tPopulation: %d\n", name, ((Nation*)result)->name, ((Nation*)result)->cap, ((Nation*)result)->surface, ((Nation*)result)->ab);

        } else ret_flag = -1;

    } else ret_flag = -1;

    // Close file pointer
    if (f) fclose(f);

    return ret_flag;
}