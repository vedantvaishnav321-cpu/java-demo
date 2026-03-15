class swapping_using_XOR {
public static void main(String[] args) {
        int a=10;
        int b=5;

        System.out.println("Before swapping");
        System.out.println("A= "+a);
        System.out.println("B= "+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;  
 
        System.out.println("After Swapping");
        System.out.println("A= "+a);
        System.out.println("B= "+b);
    }
}