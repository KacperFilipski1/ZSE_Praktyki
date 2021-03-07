package second_week.loops;

import java.lang.annotation.Annotation;

public class ZadaniaMetody {

        interface Piekacz{
            void pieczenieBabeczek();
            void pieczenieChleba();
        }

        interface Grill{
            void grillowanieKurczaka();
        }

        public static class Piec implements Piekacz, Grill {
            private int temperatura;
            private int czas;

            @Override
            public void pieczenieBabeczek(){
                temperatura = 180;
                czas = 15;
                wlacz();
            }

            @Override
            public void pieczenieChleba(){
                temperatura = 200;
                czas = 40;
                wlacz();
            }

            @Override
            public void grillowanieKurczaka(){
                temperatura = 150;
                czas = 35;
                wlacz();
            }

            private void wlacz(){
                System.out.println("Włączamy piec i ustawiamy temperaturę na: " + temperatura + " stopni Celsjusza" +
                        " oraz czas na: " + czas + " minut.");
            }
        }

    public static void main(String[] args) {

            Piec Piec = new Piec();

            Piekacz piekacz = Piec;
            Grill grill = Piec;

            piekacz.pieczenieBabeczek();
            piekacz.pieczenieChleba();
            grill.grillowanieKurczaka();

    }

}
