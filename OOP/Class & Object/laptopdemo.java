public class laptopdemo {

    public static void main(String[] args) {
        
        Laptop l1 = new Laptop();
        
        l1.setbrand("Lenovo");
        
        l1.setram(24);
      
        l1.setprice(70000);
      
    }
}

class Laptop{
    
    String brand;
    int ram;
    int price;
    
     void setbrand(String newbrand){
         brand = newbrand;
         System.out.println("Brand : " + brand);
     }
     
     void setram(int newram){
         ram = newram;
         System.out.println("RAM : " + ram);
     }
     
     void setprice(int newprice){
         price = newprice;
         System.out.println("Price : "+price);
     }
    
}

