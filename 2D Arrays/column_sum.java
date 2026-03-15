class column_sum{
     public static void main(String[] args) {
         
         int arr[][]={
                       {1,2,3},
                       {4,5,6},
                       {7,8,9}
                     };
         int sum=0;

          for (int j = 0; j < arr[0].length; j++) {
              
            for (int i = 0; i < arr.length; i++) {
        
                System.out.print(arr[i][j]+" ");
                
                sum = sum + arr[i][j];
            
            }

              System.out.println("sum= "+sum);
          } 

     }
}