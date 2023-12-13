package Classes;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Cumprimentar {

    public static void main() {

    SimpleDateFormat horarioAtual = new SimpleDateFormat("HH");
    Date dataAtual = new Date();
    int dataInt = Integer.parseInt(horarioAtual.format(dataAtual));

        if (dataInt < 12) {
                System.out.println("Good Morning!\n");

        }  else if (dataInt < 18) {
                System.out.println("Good Afternoon!\n");

        }   else {
                System.out.println("Good Evening!\n");

        }


    }

}
