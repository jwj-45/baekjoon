#include <stdio.h>
#define LEN_INPUT 10

int main(void) {
    char s1[LEN_INPUT];
    scanf("%s", s1);   
    
    int len = strlen(s1);
    
    for(int i = 0; i < len; i++) {
        if(97 <= s1[i] && s1[i] <= 122) {
            s1[i] -= 32;
        }
        else {
            s1[i] += 32;
        }
    }
    printf("%s", s1);
    return 0;
}
