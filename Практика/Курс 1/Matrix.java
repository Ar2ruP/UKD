import java.util.Random;

public class Matrix {
    public static void main(String args[]){
        int i,j,sum = 0,k = 0;
        int B[][] = new int[4][4];
        Random rand = new Random(1);
        for (i=0;i<B.length;i++)
            for (j=0;j<B.length;j++)
                B[i][j] = rand.nextInt(7)-2;
        for (i=0;i<B.length;i++){
            for (j=0;j<B.length;j++)
                System.out.print(B[i][j]+" ");
            System.out.println();
        }
        for (i=0;i<B.length;i++){
            sum=0;k=0;
            for (j=0;j<B.length;j++){
                if (B[i][j]>0){
                    sum+=B[i][j];
                    k++;}
            }
            
        }
        System.out.println("sum= "+sum+", k = "+k);
    }
}
