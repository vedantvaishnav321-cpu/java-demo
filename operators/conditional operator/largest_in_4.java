class largest_in_4 {
    public static void main(String[] args) {
        
        int a=10;
        int b=30;
        int c=20;
        int d=25;

        int res=((a>b && a>c && a>d )? a : (b>c && b>d)? b : (c>d)? c : d  );

        System.out.println(res);
    }
}