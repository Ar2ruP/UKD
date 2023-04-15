public class Lab1 {
public static void main (String args[]){
double A=1.63,B=15.65,C=8.21,D=1.265,E=2.035,x=0.65,k,e=2.7,W;
k=B/(B+C);
W=(k-Math.pow(e,(-A*x)))/x*(1+D*x)*(1+E*x);
System.out.println("k= "+k);
System.out.println("W= "+W);
}
}
