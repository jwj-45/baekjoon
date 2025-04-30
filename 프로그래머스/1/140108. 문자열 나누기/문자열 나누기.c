#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* s) {
    int answer = 0;
    char c = '\0';
    
    int len = strlen(s);
    int ft = 0;
    int sc = 0;
    
    while(*s) {
        if(c == '\0') {
            c = *s;
        }
        if(c == *s) {
            ft++;
        }
        else {
            sc++;
        }
        if(ft == sc) {
            answer++;
            c = '\0';
            ft = 0;
            sc = 0;
        }
        s++;
    }

    return ft == sc && len % 2 == 0  ? answer : ++answer;
}