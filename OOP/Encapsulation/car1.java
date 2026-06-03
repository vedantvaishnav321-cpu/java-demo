public class car1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        
        c1.cars("BMW", 2022, 198);
        c1.display();
    }
}
 
class Car {
     private String brand;
     private int model;
     private int speed;
     
     void cars(String brand, int model, int speed){
         this.brand= brand;
         this.model= model;
         this.speed= speed;
     }
     
     void display(){
         System.out.println("Brand= "+brand);
         System.out.println("Model= "+model);
         
         if(speed < 200){
             System.out.println("Speed= "+speed);
         }
         else{
             System.out.println("Not eiligible");
         }
     }
 }

