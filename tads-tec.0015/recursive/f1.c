#include <stdio.h>

int f1(int n) /* O(log(n)). Conta a quantidade de divisões sucessivas do número original por 2 que possuem resto 1.*/
{
	printf("& = %d ---",n&1);
	printf("%d\n", n);
	if (n <= 0) return 0;
	return (n&1) + f1 (n >> 1);
}

int main()
{
	printf("result = %d\n", f1(654213));
	
	return 0;
}
