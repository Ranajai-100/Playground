#include<stdio.h>

int factorial(int num);

int main()
{
    int num;
    int result;
    scanf("%d",   &num );
    result = factorial(num);
    printf("%d\n", result );
    return 0;
}
int factorial( int num)
{
    if (num == 0)
    {
        return 1;
    }
    else
    {
        return(num * factorial(num - 1));
    }
}

