#include<stdio.h>
 
int fun(int x, int y) {
    if (y == 0)
        return 0;
    return (x+fun(x,y-1));
}

int main() {
    printf("%d", fun(30,6));
    return 0;
}