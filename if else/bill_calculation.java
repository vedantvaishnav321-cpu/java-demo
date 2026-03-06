class bill_calculation{
    public static void main(String[] args) {
        
        int unit=150;

        if (unit<=100) {
            System.out.println("Bill amount= " + unit*5);
        } 

        else if(unit<=200){
            System.out.println("Bill amount= "+ unit*7);
        }
        
        else {
            System.out.println("Bill amount= " + unit*10);
        }
    }
}