/* Органiзувавши керований ввiд, ввести ряд чисел i сформувати масив з
тих, якi задовольняють певну умову (дiйснi числа, бiльшi 1 i меншi 7). Перебачити довжину масиву не бiльше 10 елементiв.*/

import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
        int []a=new int[10];
        int i;
        Scanner King=new Scanner(System.in);
        System.out.println("Введіть 10 чисел");
        for(i=0;i<a.length;i++)
            a[i]=King.nextInt();
        System.out.print("{");
        for(i=0;i<10;i++)
            if(a[i]>1 && a[i]<7)
                System.out.print(" "+a[i]);
            System.out.print(" }");
    }
}
