package second_week.loops;

public class ZadnaiaPętle {
    public static void main(String[] args) {

        //Zadanie 1
        for (int i = 0; i <= 20; i = i + 2){
            System.out.println(i);
        }

        System.out.println();

        //Zadanie 2
        for (int x = 30; x >= 0; x = x - 3){
            System.out.println(x);
        }

        System.out.println();

        //Zadanie 3
        for (int a = 1; a <= 10; a++){
            for (int b = 1; b <= 10; b++){
                int wynik = a * b;

                if (wynik % 2 == 0){
                    if (wynik <= 9){
                        System.out.print(wynik + "   ");
                    }
                    else{
                        if (wynik <= 99){
                            System.out.print(wynik + "  ");
                        }
                        else{
                            System.out.println(wynik + " ");
                        }
                    }
                }
                else{
                    System.out.print("X" + "   ");
                }
            }
            System.out.println();
        }

        //Zadanie 4
        for (int j = -40; j <= 40; j++){
            if (j % 4 == 0 && j != 0){ // 2 warunek ponieważ, nie da się podzielić zera.
                System.out.println(j);
            }
        }

    }
}
