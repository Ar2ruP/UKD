/*Написати програму, в якій вводилося б дійсне число, визначився його знак і друкувався результат: «1»- для додатнього числа, «-1»- для від’ємного і «0» для нуля.*/

import java.util.Scanner;
public class ThreeWays {
    public static void main (String Args[]){
        int Number;
        Scanner Arch= new Scanner(System.in);
        Number=Arch.nextInt();
        if(Number<0){
            System.out.println("-1");
        }
        else if (Number==0){
        System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
}
