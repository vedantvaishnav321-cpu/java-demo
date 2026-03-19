class swapping_using_single_statement{
    public static void main(String[] args) {
       
        int a=10;
        int b=5;

        System.out.println("Before swapping");
        System.out.println("A= "+a);
        System.out.println("B= "+b);

        b = a + b - (a = b);

        System.out.println("After Swapping");
        System.out.println("A= "+a);
        System.out.println("B= "+b);
    }
}