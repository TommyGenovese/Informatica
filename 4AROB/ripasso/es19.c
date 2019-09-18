#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define NX 10
#define NY 10

#define INIT '+'
#define NEW '*'

int get_input_and_modify(char coor[NX][NY], FILE *input, FILE *errors) {

    int x = -1, y = -1, errore_tro, errore_tro_global = 0;

    // Iterating through the coordinates
    while (fscanf(input, "(%d , %d) ", &x, &y) != EOF) {

        errore_tro = 0;

        if (x < 0 || x > NX - 1) {
            // C out of range!
            errore_tro = 1;
            fprintf(errors, "(%d): out of range [x]\n", x);
        }
        if (y < 0 || y > NX -1) {
            // Y out of range!
            errore_tro = 1;
            fprintf(errors, "(%d): out of range [Y]\n", y);
        }

        if (coor[x][y] == NEW) {
            // Coordinate already set previously!
            errore_tro = 1;
            fprintf(errors, "(%d, %d): Coordinate already set previously [X, Y]\n", x, y);
        }

        // Finally, set the coordinate to *
        if (!errore_tro) coor[x][y] = NEW;
        else {
            // Or add a new line to clean up
            fprintf(errors, ".\n");
            errore_tro_global = 1;
        }

    }

    return errore_tro_global;
}

void print_error(FILE *errors) {

    // Rewind the errors file, read the errors and display them
    rewind(errors);
    char line[100];
    printf("Errors: \n");
    while(fgets(line, 100, errors) != NULL) {
        printf("%s", line);
    }

    return;
}

void print_coor(char coor[NX][NY]) {

    // Print the matrix, with (0, 0) at the top left corner
    printf("\nCoordinates:\n");
    for (int y = 0; y < NY; y++) {
        for (int x = 0; x < NX; x++) {
            printf("%c ", coor[x][y]);
        }
        printf("\n");
    }

    return;
}

int main(void) {

    int return_flag = 0;

    // Making the matrix and initializing each element to +
    char coor[NX][NY];
    memset(coor, INIT, sizeof(coor));

    // File opening
    FILE *input, *errors;
    input = fopen("./input.txt", "r");
    errors = fopen("./errors.txt", "w+");

    // Checking file existance
    if (input != NULL && errors != NULL) {
        if (get_input_and_modify(coor, input, errors)) print_error(errors);
        print_coor(coor);

    } else {
        printf("Error while opening files\n");
        return_flag = -1;
    }

    // Cleaning file pointer
    if (input) fclose(input);
    if (errors) fclose(errors);

    return return_flag;
}
