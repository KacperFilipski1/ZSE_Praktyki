package second_week.loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ZadaniaTablice2 {
    public static void main(String[] args) {

        // Zadanie 1
//        int[][] tab = new int[5][5];
//        int liczba = 0;
//
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                tab[i][j] = liczba;
//                liczba = liczba + 5;
//                System.out.print(tab[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();

        //Zadanie 2
//        int[][][][] tab2 = new int[3][3][3][3];
//        Random rand = new Random();
//
//        for (int j = 0; j < 3; j++){
//            for (int k = 0; k < 3; k++){
//                for (int l = 0; l < 3; l++){
//                    for (int m = 0; m < 3; m++){
//                        int random = rand.nextInt(1000);
//                        tab2[j][k][l][m] = random;
//                        System.out.print(tab2[j][k][l][m] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//        System.out.println();

        //Zadanie 1 z list
        ArrayList<String> lista_napojow = new ArrayList<>();
            lista_napojow.add("Woda");
            lista_napojow.add("Sok Pomarańczowy");
            lista_napojow.add("Sok Jabłkowy");
            lista_napojow.add("Cola");
            lista_napojow.add("Kawa");
            lista_napojow.add(2, "Herbata");
            System.out.println(lista_napojow);

            lista_napojow.remove(1);
            lista_napojow.remove("Sok Jabłkowy");
            System.out.println(lista_napojow);

            lista_napojow.set(0, "Lava");
            System.out.println(lista_napojow);

            Collections.sort(lista_napojow);
            System.out.println(lista_napojow);

            lista_napojow.clear();
            System.out.println(lista_napojow);
    }
}
