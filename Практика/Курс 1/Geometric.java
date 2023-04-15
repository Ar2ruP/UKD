/*Скласти програму обчислення значень функцiї f(х) на вiдрiзку А,В] в точках Хi = А + iН, де  Н = (В-А)/М, М - задане цiле число.
Функція cos(x)                  A=/3          B=2/3      M=20*/

public class Geometric{
    public static void main (String Args[]){
        int M=20;
        double x,π=3.14,A=π/3,B=2*π/3,H,W;
        H=(B-A)/M;
        x=A+H;
        W=Math.cos(x);
        System.out.println(W);
    }
}
