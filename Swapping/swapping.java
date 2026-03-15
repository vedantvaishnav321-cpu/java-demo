
import java.util.Scanner;
class swapping{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    
          System.out.println("Enter number 1= ");
          int a=sc.nextInt();
      
          System.out.println("Enter number 2= ");
          int b=sc.nextInt();

          System.out.println("Before Swapping");
          System.out.println("A= "+a);
          System.out.println("B= "+b);

          int swap=a;
              a=b;
              b=swap;

          System.out.println("After swapping");
          System.out.println("a = "+a);
          System.out.println("b = "+b);
    
    }
}