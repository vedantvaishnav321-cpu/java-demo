class count_even_odd {
    public static void main(String[] args) {

        int arr[] = {2, 5, 8, 11, 14};
        int even = 0;
        int odd = 0;

        System.out.print("Even numbers: ");
        for(int i = 0; i < arr.length; i++){

            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
                even++;
            }
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for(int i = 0; i < arr.length; i++){

            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
                odd++;
            }
        }

        System.out.println();
        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
    }
}