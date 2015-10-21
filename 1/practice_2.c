#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void reverse(char src[]){
    int i;
    int j;
    char temp;
    j = strlen(src)-1;
    for (i = 0; i<j; i++,j--) {
        temp = src[i];
        src[i] = src[j];
        src[j] = temp;
        
    }
    
    
}


void reverse2(char*src){
    char*end = strdup(src);
    char tmp;
    if (src) {
        while (*end) {
            ++end;
        }
        --end;
        
        while (src<end) {
            tmp = *src;
            *src++ = *end;
            *end-- = tmp;
        }
    }
}
int main(){
    char first[] = "123456";
    char * second = "123456";
    //first[0] = '2';
    reverse(first);
    printf("%s\n",first);
    reverse2(second);
    printf("%s\n",second);
}