 class second_largest{
    public static void main(String[] args) {
        
        int arr[]={2,3,4,1,6,9,5,8};
        int largest=arr[0];
        int second=arr[0];

          for (int i = 0; i < arr.length; i++) {
              
              if(arr[i] > largest){
                 second = largest;
                 largest = arr[i];
              }

              else if (arr[i] > second && arr[i] != largest ) {
                 second = arr[i];
          
              }
           }

          System.out.println("second largest= "+second);
    }
 }