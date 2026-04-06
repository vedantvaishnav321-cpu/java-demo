public class linear_search {
    
    public static int linear(int num[] , int key) {

        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int num[]= {2,3,4,5,6,7,8,8,5};
        int key =8;

        int index=linear(num, key);

        if(index == -1){
            System.out.println("Not found ");
        }
        else{
            System.out.println("key is at index "+index);
        }
    }
}
