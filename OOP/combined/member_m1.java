class Person{
    private String name;
    private int id;
     
     Person(String name, int id){
         this.name=name;
         this.id=id;
     }
     
     void displayperson(){
         System.out.println("Name = "+name);
         System.out.println("id = "+id);
     }
}

class Member extends Person {
    private String membershiptype;
    
     Member(String name, int id, String membershiptype){
         super(name,id);
         this.membershiptype = membershiptype;
     }
     
     void displaymember(){
         System.out.println("membershiptype= " + membershiptype);
     }
}
class member_m1 {
    public static void main(String[] args) {
          Member m =new Member("vedant" , 1011 , "Primium");
          
          m.displayperson();
          m.displaymember();
    }
}

