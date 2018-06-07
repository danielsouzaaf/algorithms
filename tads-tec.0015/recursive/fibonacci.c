#include <stdio.h>

long fibonacci(int n)
{
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	else
		return fibonacci(n - 1) + fibonacci(n - 2);
}

int main()
{
	int f = fibonacci(25);
	printf("%d\n", f);
}
