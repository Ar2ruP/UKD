// Скласти програму, яка вводила б два цiлi числа, знаходила iх добуток, рiзницю i виводила результат на екран.

import java.util.Scanner;
public class Calculator {
    public static void main (String Args[]){
        int dif, dob;
        Scanner Arch =new Scanner(System.in);
        System.out.println("Введіть перше число");
        int a=Arch.nextInt();
        System.out.println("Введіть Друге число");
        int b=Arch.nextInt();
        dob=a*b;
        dif=a-b;
        System.out.println("Добуток першого і другого числа буде дорівнювати " +dob);
        System.out.println("Різниця першого і другого числа буде дорівнювати " +dif);
    }
}
