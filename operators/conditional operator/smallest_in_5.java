class smallest_in_5 {
    public static void main(String[] args) {
        
        int a=1;
        int b=3;
        int c=20;
        int d=5;
        int e=9;

        int res=((a<b && a<c && a<d && a<e )? a : (b<c && b<d && b<e)? b : (c<d && c<e)? c : (d<e) ? d:e );

        System.out.println(res);
    }
}