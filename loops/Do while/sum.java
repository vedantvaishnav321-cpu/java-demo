
class sum {

    public static void main(String[] args) {

        int n = 1;
        int sum = 0;

        do {
            sum = sum + n;
            n++;
        } while (n <= 10);

        System.out.println("sum =" + sum);
    }
}
