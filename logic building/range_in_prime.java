public class range_in_prime {
    
    public static boolean isprime(int num) {

        for( int i=2; i<num-1; i++){
            if(num % i == 0){
                return false;
            }
        }

         return true;
    }

    


    public static void rangeinprime (int n) {
        
        for (int i=2; i<n-1; i++){
            if(isprime(i)){
                System.out.print(i + "  ");
            }
        }

        System.out.println();
    }

    
     public static void main(String[] args) {
    
        rangeinprime(200);
     }
}
