#include <stdio.h>

long fatorial (int n)
{
	if (n == 1)
		return n;
	return n * fatorial(n-1);
}

int main()
{
	int a;
	a = fatorial(10);
	printf("%d\n", a);
	
	return 0;
}
