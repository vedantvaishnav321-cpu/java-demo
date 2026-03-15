import java.util.Scanner;
class marraige{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter your Gender= ");
      char gen=sc.next().charAt(0);  

      System.out.println("Enter your salary: ");
      int sal=sc.nextInt();

        if ( gen == 'M' || gen == 'm' ) {
                 if( sal >= 100000 ){
                    System.out.println(" He is elegibile for marraige");
                 }
                   else{
                    System.out.println("Not elegible");
                 }
        } else {
                if( gen=='F' || gen=='f' ){
                   
                   if ( sal >= 50000 ) {
                       System.out.println("She is elegible for marraige");
                   } else {
                       System.out.println("Not elegible");
                   }

                }  
              }

    }
}