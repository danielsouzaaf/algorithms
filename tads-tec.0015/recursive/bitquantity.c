#include <stdio.h>

long calculateQuantity(int n, int quantity)
{
	if (n == 0)
		return quantity;
	return (calculateQuantity(n/2, ++quantity));
}

int main()
{
	int n = 10;
	int q = calculateQuantity(n, 0);
	printf("%d\n", q);
	
	return 0;
}




