#include "string.h"
#include <stdio.h>
#include <stdlib.h>

int main(void){
  
    char* str1 = "hola";
    char* str2 = (char*) malloc( 20 * sizeof(char));
    printf("Escribe hola: ");
    scanf("%s", str2);
    
    if (strcmpic(str1, str2) != 0) printf("no escribiste hola :c\n");
    else{printf("Son Iguales\n");}
}