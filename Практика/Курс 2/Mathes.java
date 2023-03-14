//Скласти програму обчислення значень функцiї f(х) на вiдрiзку А,В] в точках Хi = А + iН, де  Н = (В-А)/М, М - задане цiле число.

public class Mathes{
    public static void main (String Args[]){
        int M=20;
        double x,π=3.14,A=π/3,B=2*π/3,H,W;
        H=(B-A)/M;
        x=A+H;
        W=Math.cos(x);
        System.out.println(W);
    }
}
