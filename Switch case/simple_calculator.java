import java.util.Scanner;
class simple_calculator{
   public static void main(String[] args){
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("----------Enter your choice---------");
      System.out.println("1. Addition");
      System.out.println("2. substraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");


      System.out.print("Enter your choice= ");
      int choice=sc.nextInt();  

      System.out.print("Enter number 1= "); 
      int a=sc.nextInt();
      
      System.out.print("Enter number 2=");
      int b=sc.nextInt();



      switch (choice) {
          case 1:
               int add=a+b;
               System.out.println("Addition= "+add);
              break;
          
           case 2:
               int sub=a-b;
               System.out.println("Substraction= "+sub);
              break;
              
           case 3:
               int mul=a*b;
               System.out.println("Multiplicaion= "+mul);
              break; 
              
           case 4:
               int div=a/b;
               System.out.println("Division= "+div);
              break;
              
              
          default:
              System.out.println("Invalid choice");
      }
   }
}