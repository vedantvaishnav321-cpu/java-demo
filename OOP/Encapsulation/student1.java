public class student1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setname("yash");
        s1.setrollno(101);
        s1.setmarks(82.60);

        System.out.println("Name = " + s1.getname());
        System.out.println("Rollno = " + s1.getrollno());
        System.out.println("Marks = " + s1.getmarks());
    }
}

class Student {
    private String name;
    private int rollno;
    private double marks;

    void setname(String name) {
        this.name = name;
    }

    void setrollno(int rollno) {
        this.rollno = rollno;
    }

    void setmarks(double marks) {
        this.marks = marks;
    }

    public String getname() {
        return name;
    }

    public int getrollno() {
        return rollno;
    }

    public double getmarks() {
        return marks;
    }
}
