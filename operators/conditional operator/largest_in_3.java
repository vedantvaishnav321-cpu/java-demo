class largest_in_3 {
    public static void main(String[] args) {
        
        int a=10;
        int b=30;
        int c=20;

        int res=((a>b && a>c )? a : (b>c)? b:c  );

        System.out.println(res);
    }
}