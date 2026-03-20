class middle_number{
   public static void main(String[] args) {
       
       int a=10;
       int b=15;
       int c=20;

       if((a>b && a<c) || (a<b && a>c)){
        System.out.println("A is middle");
       }

       else if((b>a && b<c) || (b<a && b>c)){

        System.out.println("B is middle");
       }

       else{
        System.out.println("C is middle");
       }
   }
}