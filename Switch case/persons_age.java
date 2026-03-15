import java.util.Scanner;
 public class persons_age{
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter your age= ");
      int age=sc.nextInt();

       switch (age) {
           case 18:
              System.out.println("Adult");
              break;
           
           case 23:
               System.out.println("Join a Job!");
               break;

           case 40:
                System.out.println("Get married");
                break;

           case 50:
               System.out.println("Get retired");
               break;

            default:
               System.out.println("Enjoy your life");          
       }

       System.out.println("Thanks");

    sc.close();   
   }  
 }