class mobile_m1 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("iphone",120000);
        m1.display();
    }
}

class Mobile{
    String brand;
    int price;
    
    Mobile(String brand, int price){
        this.brand=brand;
        this.price=price;
    }
    
    void display(){
        System.out.println("Brand= "+brand);
        System.out.println("price= "+price);
    }
}
