
public class Reactangle1{
    public static void main(String[] args) {
        Reactangle r1 = new Reactangle();
        r1.setlength(10.5);
        System.out.println(r1.length);
        r1.setbreadth(12.5);
        System.out.println(r1.breadth);
        r1.area();
        System.out.println(r1.area());
        
    }
}

class Reactangle {
  double length;
  double breadth;
  
    void setlength(double newlength){
        length = newlength;
    }
    
    void setbreadth(double newbreadth){
        breadth = newbreadth;
    }
    
    double area(){
        return length * breadth;
    }
  
}