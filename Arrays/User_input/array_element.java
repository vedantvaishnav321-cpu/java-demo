import java.util.Scanner;
 
   class array_element{
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter size= ");
          int n=sc.nextInt();

          int arr[] = new int [n];

          System.out.println(" ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
          System.out.println(" ");
          
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


       }

   }