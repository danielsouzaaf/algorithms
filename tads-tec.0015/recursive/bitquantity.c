#include <stdio.h>

long calculateQuantity(int n)
{
	if (n == 0) return 0;
	if (n == 1) return 1;
	return 1+calculateQuantity(n>>1);
}

int main()
{
	int n = 10;
	int q = calculateQuantity(n);
	printf("%d\n", q);
	return 0;
}




