
import java.util.Scanner;

class function_parameter {

    static void add(int a, int b) {

        int sum = a + b;
        System.out.println("sum " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1= ");
        int a = sc.nextInt();
        System.out.println("Enter number 2= ");
        int b = sc.nextInt();
        add(a, b);


        sc.close();
    }
}
