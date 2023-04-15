/*2.	Для непарних варiантiв - впорядкувати масив по зростанню. Алгоритм вибрати самостiйно. */

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        int [] a = new int[10];
        Scanner King=new Scanner(System.in);
        System.out.println("Введіть 10 чисел");
        for(int i=0;i<a.length;i++)
            a[i]=King.nextInt();
        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]) {
                    isSorted = false;

                    tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    }
