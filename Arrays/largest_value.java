public class largest_value {
    
    public static int large(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++){
           
            if(largest < num[i]){
            largest = num[i];
            }

            if(smallest > num[i]){
            smallest = num[i];
            }
        }

         System.out.println("Smallestr value is = " + smallest);
        
        return largest;
    }
    
    public static void main(String[] args) {

        int num[]={2,3,4,5,67,4,32,2};
        
        System.out.println("The largest value is= " + large(num));
    }
}
