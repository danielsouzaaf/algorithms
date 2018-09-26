package ifrn.diatinf.tads;

public class Main {

    private static int buscaBinaria(int[] A,  int value, int min, int max) {
        int VALUE_NOT_FOUND = -99999;

        int m = (max + min) / 2;
        int c = A[m];

        if (min > max)
        {
            return VALUE_NOT_FOUND;
        }
        else if (c == value)
        {

            return m;
        }
        else if(value < c)
        {
            return buscaBinaria(A, value, min, m-1);
        }
        else {
            return buscaBinaria(A,value, m+1, max);
        }
    }

    public static void main(String[] args) {
	    int A[] = new int[]{1, 2, 3, 4, 5, 98, 99, 250, 54930, 98546};

	    int index = buscaBinaria(A, 1321, 0, A.length);

	    System.out.println(index);


    }
}
