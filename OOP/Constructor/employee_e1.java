
class employee_e1 {
    public static void main(String[] args) {
        Employee e1= new Employee("Akshay",50000);
        e1.display();
    }
}

class Employee{
    String name;
    int salary;
    
    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    
    void display(){
        System.out.println("Name= "+name);
        System.out.println("Salary= "+salary);
    }
}


