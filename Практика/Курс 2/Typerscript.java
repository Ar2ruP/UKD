public class Typescript{
    public static void main (String Args[]){
        double w = 0,x = 1,h=0.5,a=2.8,b=-0.3,c=4;
        System.out.println("x      W");
        while (1<=x && x<=2) {
            if (x < 1.2)
                w = a * Math.pow(x, 2) + b * x + c;
            if (x == 1.2)
                w = a / x + Math.sqrt(Math.pow(x, 2) + 1);
            if (x > 1.2)
                w = (a + b * x) / Math.sqrt(Math.pow(x, 2) + 1);
            x += h;
            System.out.println(x + "    " + w);
        }
        return;

    }
}
