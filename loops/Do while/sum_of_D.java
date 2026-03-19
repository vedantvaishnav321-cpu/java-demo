class sum_of_D{
    public static void main(String[] args) {
        
        int num=12543;
        int sum=0;
         
          do { 
              sum = sum + (num % 10);
              num = num / 10;
             
          } while (num != 0);

          System.out.println("sum "+sum);
    }
}