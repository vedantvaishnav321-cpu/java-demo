import java.util.Scanner;;
public class average {
    
    public static double average (double a, double b, double c) {

        return (a + b + c) / 3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A= ");
        double a= sc.nextDouble();
        
        System.out.println("Enter B= ");
        double b= sc.nextDouble();
        
        System.out.println("Enter C= ");
        double c= sc.nextDouble();
        
        System.out.println("Average= " + average(a,b,c));

        sc.close();
    }
}
