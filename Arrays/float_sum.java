class float_sum{
    public static void main(String[] args) {
        
        float arr[]= {1.2f, 2.3f, 3.3f, 4.4f, 5.5f};

        float sum=0;

          for (int i = 0; i < arr.length; i++) {
              
              sum = sum + arr[i];
          }

          System.out.println("sum= "+sum);
    }
}