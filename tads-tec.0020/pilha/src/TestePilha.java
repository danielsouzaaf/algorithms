import java.util.Random;
import java.util.Scanner;

public class TestePilha {

    public static void main(String[] args) throws EPilhaVazia {
        PilhaRubroNegra pRN = new PilhaRubroNegra(5);
        Scanner s = new Scanner(System.in);
        System.out.println("0 - Sair\n 1 - Push Rubro\n 2 - Push Negra\n 3 - Pop Rubro\n 4 - Pop Negra\n 5 - Printar Rubro\n 6 - Printar Negra");
        int opcao = s.nextInt();
        Random rand = new Random();
        while (opcao != 0) {
            if (opcao == 1) //Push Random Rubro
                pRN.pushRubro(rand.nextInt(8796) + 1);
            else if (opcao == 2) //Push Random Negro
            pRN.pushNegra(rand.nextInt(8796) + 1);
            else if (opcao == 3) //Pop Rubro
                System.out.println(pRN.popRubro());
            else if (opcao == 4) //Pop Negra
                System.out.println(pRN.popNegra());
            else if (opcao == 5) //Top Rubro
                System.out.println(pRN.topRubro());
            else if (opcao == 6)  //Top Negra
                System.out.println(pRN.topNegra());
            else if (opcao == 7) //Printar Rubro
                pRN.printarRubro();
            else if (opcao == 8) //Printar Negra
                pRN.printarNegra();
            else if (opcao == 9) //Printar como Array
                pRN.printarArray();

            System.out.println("0 - Sair\n 1 - Push Rubro\n 2 - Push Negra\n 3 - Pop Rubro\n 4 - Pop Negra\n 5 - Top Rubro\n 6 - Top Negra\n 7 - Printar Rubro\n 8 - Printar Negra\n 9 - Printar como Array");
            opcao = s.nextInt();
        }

        
    }


}
