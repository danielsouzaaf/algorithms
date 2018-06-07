#include <stdio.h>

long findBiggest(int array[], int length, int previous)
{
	if (length == 0)
		return previous;
	if (previous < array[length - 1])
		previous = array[length - 1];
		
	return findBiggest(array, length - 1, previous);
}

int main()
{
	int a[] = {1, 4, 6, 8, 3, 2, 6506, 321, 95406, 3241};
	int biggest = findBiggest(a, 10, a[9]);
	printf("%d\n", biggest);
	
	return 0;
}



