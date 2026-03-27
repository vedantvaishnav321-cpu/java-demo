import java.util.Scanner;
  
public class evenodd {

    public static boolean iseven (int n) {
      if(n % 2 == 0){
        return true;
      }

       return false;
        
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

       System.out.println("Enter any number= ");
       int n =sc.nextInt();

       System.out.println("Check even or odd");
    
       System.out.println(iseven(n));
       
       sc.close();
    }
}

