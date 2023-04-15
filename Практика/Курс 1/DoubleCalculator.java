/*Ввести 6 чисел, знайти їх суму і середнє арифметичне*/

import java.util.Scanner;
public class DoubleCalculator {
    public static void main (String Args[]){
        double sum;
        double mid;
        double First, Second, Third, Fourth, Fifth, Sixth;
        Scanner Arch= new Scanner(System.in);
        System.out.println("Введіть будь ласка 6 чисел");
        First=Arch.nextInt();
        Second=Arch.nextInt();
        Third=Arch.nextInt();
        Fourth=Arch.nextInt();
        Fifth=Arch.nextInt();
        Sixth=Arch.nextInt();
        sum=First+Second+Third+Fourth+Fifth+Sixth;
        mid=(First+Second+Third+Fourth+Fifth+Sixth)/6;
        System.out.println("Сума всіх чисел:"+sum);
        System.out.println("Середнє арифметичне усіх чисел:"+mid);
    }
}
