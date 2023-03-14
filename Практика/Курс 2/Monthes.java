//Написати програму, яка б після вводу порядкового номеру місяця виводила його назву

import java.util.Scanner;
public class Typescript {
    public static void main (String Args[]){
        int Number;
        Scanner Arch= new Scanner(System.in);
        System.out.println("Введіть порядковий номер місяця");
        Number=Arch.nextInt();
        if(Number<1||Number>12) {
            System.out.println("Місяця під таким номером не існує");}
            switch (Number) {
                case 1:
                    System.out.println("Місяць під номером " + Number + " - січень");
                    break;
                case 2:
                    System.out.println("Місяць під номером " + Number + " - лютий");
                    break;
                case 3:
                    System.out.println("Місяць під номером " + Number + " - березнь");
                    break;
                case 4:
                    System.out.println("Місяць під номером " + Number + " - квітень");
                    break;
                case 5:
                    System.out.println("Місяць під номером " + Number + " - травень");
                    break;
                case 6:
                    System.out.println("Місяць під номером " + Number + " - червень");
                    break;
                case 7:
                    System.out.println("Місяць під номером " + Number + " - липень");
                    break;
                case 8:
                    System.out.println("Місяць під номером " + Number + " - серпень");
                    break;
                case 9:
                    System.out.println("Місяць під номером " + Number + " - вересень");
                    break;
                case 10:
                    System.out.println("Місяць під номером " + Number + " - жовтень");
                    break;
                case 11:
                    System.out.println("Місяць під номером " + Number + " - листопад");
                    break;
                case 12:
                    System.out.println("Місяць під номером " + Number + " - грудень");
                    break;
            }

        }
    }
