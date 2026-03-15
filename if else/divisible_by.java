class divisible_by{
    public static void main(String[] args) {
        
        int num=30;

        if (num % 2==0 && num % 3==0 && num % 5==0) {

           System.out.println("Disible by 2, 3, 5");    
        } 
        
        else {
            System.out.println("Not divisible");
        }
    }
}