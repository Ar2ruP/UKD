import java.util.Scanner;
public class Calendar {
    public static void main (String Args[]){
        int b=1649,c;
        Scanner Arch =new Scanner(System.in);
        System.out.println("Який сьогодні рік?");
        int a=Arch.nextInt();
        c=a-b;
        System.out.println("Битва під Берестечком відбулася "+c+" років тому");
    }
}
