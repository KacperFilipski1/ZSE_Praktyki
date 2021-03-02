package second_week.loops;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ZadaniaTablice {
    public static void main(String[] args) {

        //Zadanie 1
        char[] array = {'a', 'g', 'y', 'r', 'q', 'b', 'v', 'd', 'f', 'l'};
        Arrays.sort(array);
        System.out.println("Sortowanie w porządku rosnącym: " + Arrays.toString(array));

        //Zadanie 2
        String[] array2 = {"ok", "zadanie", "&*", "pies", "kot", "$%", "mam", "Kacper", "@#", "ryba"};
        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku rosnącym: " + Arrays.toString(array2));

        //Zadanie 3
        Random rand = new Random();
        int rand_1 = rand.nextInt(3);
        String[] array3 = {"Rudolf", "Bobo", "Zbychu"};
        System.out.println(array3[rand_1]);

        //Zadanie 4
        String[] sniadanie = {"tosty z serem", "jajecznicę", "kanapkę", "nic"};
        String[] obiad = {"makaron", "ryż", "pizzę", "nic"};
        String[] kolacja = {"kanapkę", "ugotowane jajko", "płatki z mlekiem", "nic"};
        int random_1 = rand.nextInt(4);
        int random_2 = rand.nextInt(4);
        int random_3 = rand.nextInt(4);
        System.out.println("Na śniadanie zjem " + sniadanie[random_1] + ", na obiad " + obiad[random_2] + ", na kolecję " + kolacja[random_3] + ".");

    }
}