class count_digits{
    public static void main(String[] args) {
        
        int n=1223425;
        int count=0;

         do { 
             n = n /10;
             count++;
         } while (n != 0);

         System.out.println("count= "+count);
    }
}