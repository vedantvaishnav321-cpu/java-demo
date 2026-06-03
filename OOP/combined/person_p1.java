class Person{
    String name;
    int age;
        Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends Person {
    int rollno;
    Student(String name, int age, int rollno){
        super(name , age);
        this.rollno=rollno;
    }
    void display(){
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Rollno = "+ rollno);
    }
}

class person_p1 {
    public static void main(String[] args) {
         Student s = new Student("Tanmay" , 22 , 2111 );
         s.display();
         
    }
}