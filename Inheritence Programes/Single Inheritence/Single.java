class Employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}


class Manager extends Employee {
    String department;

    void setDepartment(String department) {
        this.department = department;
    }

    void showManagerDetails() {
        showDetails(); // Call parent class method
        System.out.println("Department: " + department);
    }
}


public class Single {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setDetails("Alice Johnson", 75000);
        m.setDepartment("IT");

        System.out.println("Manager Details:");
        m.showManagerDetails();
    }
}
