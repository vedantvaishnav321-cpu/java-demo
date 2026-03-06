class greatest_of_four {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 15;
        int d = 30;

        int greatest = (a > b ? a : b);
        greatest = (greatest > c ? greatest : c);
        greatest = (greatest > d ? greatest : d);

        System.out.println("Greatest number is: " + greatest);
    }
}