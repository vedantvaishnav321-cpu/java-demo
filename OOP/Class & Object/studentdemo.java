public class studentdemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setdata("Vedant",2108,82.67);
        
        s1.display();
    }
}

 class Student{
    String name;
    int rollno;
    double marks;
    
    void setdata(String newname, int newrollno, double newmarks){
        name = newname;
        rollno = newrollno;
        marks = newmarks;
    }
    
    void display(){
        System.out.println("Name  : " +name);    
        System.out.println("RollNo :"+rollno);
        System.out.println("Marks :"+marks);
    }
}