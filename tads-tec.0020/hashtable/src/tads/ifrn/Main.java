package tads.ifrn;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
	HashTable table = new HashTable(500);

	Random rand = new Random();

	for (int i = 0; i < 500; i++)
    {
        int r = rand.nextInt(i + 1) + 1;
        int z = rand.nextInt(i + 1) + 1;
        table.put(z, r);
    }

    table.display();


    }
}
