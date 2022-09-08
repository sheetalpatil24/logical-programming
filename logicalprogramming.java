//perfect number is When the number is equal to the sum of its positive divisors excluding the number
import java.util.Scanner;


public class logicalprogramming{
public static void main(String[] args) {
    int n, sum=0;
    System.out.println("enter any number");
    Scanner r= new Scanner(System.in);
    n=r.nextInt();

    for(int i=1; i<n; i++)
    {
      if(n%i==0)
    {
    sum= sum + i;
    }
 }
    if (n==sum)
    System.out.println("it is a perfect number");

    else 
    System.out.println("not a perfect number");
   }

}
  




    
    
    
        
    
     
    
      
      