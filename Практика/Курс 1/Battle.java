/*Скласти програму,  яка б повiдомляла,  що битва пiд Берестечком вiдбулася в 1649р.,  запитувала,  який тепер рiк,  i друкувала, скiльки рокiв пройшло з того часу.*/

import java.util.Scanner;
public class Battle {
    public static void main (String Args[]){
        int b=1649,c;
        Scanner Arch =new Scanner(System.in);
        System.out.println("Який сьогодні рік?");
        int a=Arch.nextInt();
        c=a-b;
        System.out.println("Битва під Берестечком відбулася "+c+" років тому");
    }
}
