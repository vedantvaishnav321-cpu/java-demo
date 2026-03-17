import java.util.Scanner;
class even_odd {
     
     static void checkevenodd( int num){
        if(num % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
     }
     public static void main (String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any number= "); 
          int num=sc.nextInt();
          checkevenodd(num);
   
    }
}