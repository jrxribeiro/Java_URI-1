/*
  576 / 100
   76     5 = q100

resto = 76
   76 / 50 = q50
   26    1 

resto = 26
   26 / 20 = q20
    6    1

resto = 6
    6 / 10 = q10
    6    0

resto = 6
    6 / 5 = q5
    1   1

resto = 1
    1 / 2 = q2
    1   0

resto = 1 = q1
*/


import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valorLido, resto;
        int q100, q50, q20, q10, q5, q2, q1;

        valorLido = teclado.nextInt();

        q100  = valorLido / 100;
        resto = valorLido % 100;

        q50   = resto / 50;
        resto = resto % 50;

        q20   = resto / 20;
        resto = resto % 20;

        q10   = resto / 10;
        resto = resto % 10;

        q5    = resto / 5;
        resto = resto % 5;

        q2    = resto / 2;
        q1    = resto % 2;

        System.out.println(valorLido);
        System.out.println(q100 + " nota(s) de R$ 100,00");
        System.out.println(q50  + " nota(s) de R$ 50,00");
        System.out.println(q20  + " nota(s) de R$ 20,00");
        System.out.println(q10  + " nota(s) de R$ 10,00");
        System.out.println(q5   + " nota(s) de R$ 5,00");
        System.out.println(q2   + " nota(s) de R$ 2,00");
        System.out.println(q1   + " nota(s) de R$ 1,00");
    }
}