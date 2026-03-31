public class array_argument {
    
    public static void update(int arr[]) {
        
        for(int i=0; i<arr.length; i++){
            arr[i]= arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {96,97,98};
        update(arr);
        
        for(int i=0; i<=arr.length; i++){
            System.out.println(arr[i] + " ");
        }
         System.out.println();
    }
}
