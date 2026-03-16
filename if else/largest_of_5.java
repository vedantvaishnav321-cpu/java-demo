
import java.util.Scanner;

class largest_of_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1= ");
        int a = sc.nextInt();

        System.out.println("Enter number 2= ");
        int b = sc.nextInt();

        System.out.println("Enter number 3= ");
        int c = sc.nextInt();

        System.out.println("Enter number 4= ");
        int d = sc.nextInt();

        System.out.println("Enter number 5= ");
        int e = sc.nextInt();

        if (a > b && a > c && a > d && a > e) {
            System.out.println(a + " A is greater");
        } else if (b > c && b > d && b > e) {
            System.out.println(b + " B is greater");
        } else if (c > d && c > e) {
            System.out.println(c + " C is greater");
        } else if (d > e) {
            System.out.println(d + " d is greater");
        } else {
            System.out.println(e + "e is greater");
        }

    }
}
