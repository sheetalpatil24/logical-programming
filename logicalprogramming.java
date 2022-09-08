// fibonacci series will start with 0 or 1
//0 1 1 2 3 5 8 13 series formed by adding  last two numbers
import java.util.Scanner;
public class logicalprogramming {
    public static void main(String[] args) {
        int term ,a=0,b=1,c;
        System.out.println("enter term");
        Scanner r = new Scanner(System.in) ;
        term =r.nextInt();

    for(int i=1;i<=term;i++){

        System.out.println(a+"");
        c=a+b;
        a=b;
        b=c;
     }
}
}
