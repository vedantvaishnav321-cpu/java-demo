
class student_s1 {
    public static void main(String[] args) {
      Student s1 = new Student("yash",101);
       s1.display();
    }
}

class Student{
    String name;
    int rollno;
    
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }  
        
    void display(){
        System.out.println("Name= "+name);
        System.out.println("Rollno= "+rollno);
    }  
    
}