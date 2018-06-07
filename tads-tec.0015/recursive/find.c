#include <stdio.h>

long find(int array[], int length, int value)
{
	if (length == 0)
		return 0; //Couldn't find the element
	if (array[length - 1] == value)
		return 1; //Could find the element
		
	return find(array, length - 1, value);
}

int main()
{
	int a[] = {1, 4, -6, -8, -3, 2, -6506, -321, 95406, -3241};
	int f = find(a, 10, 232);
	printf("%d\n", f);
	
	return 0;
}



