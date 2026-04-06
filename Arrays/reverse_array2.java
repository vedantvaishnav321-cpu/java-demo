public class reverse_array2 {

    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;

        while (first < last) {

            int temp;
            temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int num[] = { 2, 4, 5, 6, 7, 8, 9 };
        reverse(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
        System.out.println("");
    }

}
