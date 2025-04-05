class Employee {
    String name;
    int id;
    double salary;

   
    Employee() {
        name = "Unknown";
        id = 0;
        salary = 0.0;
    }

   
    Employee(String empName, int empId) {
        name = empName;
        id = empId;
        salary = 30000.0; 
    }

   
    Employee(String empName, int empId, double empSalary) {
        name = empName;
        id = empId;
        salary = empSalary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("John", 102);
        Employee e3 = new Employee("Emma", 103, 45000.0);

        e1.display();
        e2.display();
        e3.display();
    }
}