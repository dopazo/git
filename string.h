#include <string.h>
int strcmpic(char *str1, char *str2){
    //printf("str1: %s - str2: %s\n",str1, str2);
    do{
        int diferencia=strcmp(str1,str2);//0 iguales
        if (diferencia<0)
        diferencia=-1*diferencia;
        //printf("diferencia: %i\n", diferencia);
        
        if(diferencia==0 || diferencia==32)//0=iguales, 32=diferencia entre mayusc y minusc
        {
           str1+=1;
           str2+=1;
        }
        else
        return diferencia;
        
    }while((*str1!='\0')&&(*str2!='\0'));
    
    if( ((*str1!='\0')&&(*str2=='\0')) || ((*str1=='\0')&&(*str2!='\0')) ) //si una palabra es mas larga
        {
            return 1;
        }
    return 0;
}