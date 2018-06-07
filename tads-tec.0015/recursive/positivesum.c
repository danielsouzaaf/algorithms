#include <stdio.h>

long positiveSum(int array[], int length, int previous)
{
	if (length == 0)
		return previous;
	if (array[length - 1] > 0)
		previous += array[length - 1];
		
	return positiveSum(array, length - 1, previous);
}

int main()
{
	int a[] = {1, 4, -6, -8, -3, 2, -6506, -321, 95406, -3241};
	int sum = positiveSum(a, 10, 0);
	printf("%d\n", sum);
	
	return 0;
}



