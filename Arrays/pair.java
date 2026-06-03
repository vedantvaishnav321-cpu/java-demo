public class pair {

    public static void printpair(int num[]) {

        for (int i = 0; i < num.length; i++) {
            int cur = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + cur + "," + num[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int num[] = { 2, 3, 4, 5, 6 };
        printpair(num);
    }

}