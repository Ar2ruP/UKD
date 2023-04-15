/*Знайти суму так кількість додатніх елементів та добуток і кількість відємних елементів, а також середнє арифметичне.*/

import java.util.Scanner;
public class SmartCounter {
    public static void main(String[] args) {
        int sum=0,positive=0,negative=0,dob=1,mid=1,i;
        int[]a=new int[10];
        Scanner King = new Scanner(System.in);
        System.out.println("Введіть 10 чисел");
        for(i=0;i<a.length;i++)
            a[i]=King.nextInt();
        for(i=0;i<a.length;i++) {
            sum = sum + a[i];
            dob = dob * a[i];
            mid=sum/a.length;
        }
        for(i=0;i<a.length;i++){
            if (a[i]<0)
                negative++;
            if (a[i]>0)
                positive++;
        }
        System.out.println("Сумма="+sum);
        System.out.println("Добуток="+dob);
        System.out.println("Кількість додатніх чисел="+positive);
        System.out.println("кількість від’ємних чисел="+negative);
        System.out.println("Середнє арифметичне="+mid);
    }
}
