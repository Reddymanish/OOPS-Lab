class Student {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

class Encap1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Manish");
        System.out.println("Student Name: " + s.getName());
    }
}