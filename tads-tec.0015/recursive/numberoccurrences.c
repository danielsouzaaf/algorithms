#include <stdio.h>

int countOccurrences(int needle, int haystack, int quantity)
{
	if (haystack <= 0)
		return quantity;
		
	if (haystack % 10 == needle)
		++quantity;
		
	return countOccurrences(needle, haystack / 10, quantity);
}


int main()
{
	printf("%d\n", countOccurrences(3, 1234223833, 0));
	return 0;
}
