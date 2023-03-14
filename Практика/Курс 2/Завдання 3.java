import java.util.Scanner;
public class Typescript {
    public static void main (String Args[]){
        int District, Shop, SequenceNumber;
        double Issued;
        Scanner Arch=new Scanner(System.in);
        System.out.println("Введіть порядковий номер:");
        SequenceNumber=Arch.nextInt();
        System.out.println("Введіть номер дільниці:");
        District=Arch.nextInt();
        System.out.println("Введіть номер цеху:");
        Shop=Arch.nextInt();
        System.out.println("Введіть видану суму:");
        Issued=Arch.nextInt();
        System.out.print("№/ПП:"+SequenceNumber+"| Дільниця:"+District+"| Цех:"+Shop+"| Видано:"+Issued);
}}
