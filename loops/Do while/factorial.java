
class factorial {

    public static void main(String[] args) {

        int n = 1;
        int fact = 1;

        do {
            fact = fact * n;
            n++;
        } while (n <= 5);

        System.out.println("fact= " + fact);
    }
}
