import java.util.Scanner;
class max_function{

    public static void max( int a , int b){
        if(a > b) {
            System.out.println("a is greater");  
        }
        else{
            System.out.println("b is greater");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value= ");
        int a=sc.nextInt();
        System.out.println("Enter b value= ");
        int b=sc.nextInt();

        max(a,b);


        sc.close();
    }
}