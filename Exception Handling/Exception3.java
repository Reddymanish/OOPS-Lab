class ExceptionExample_3 {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Access Denied: Age must be 18 or above.");
        } else {
            System.out.println("Access Granted.");
        }
    }
}

public class Exception3 {
    public static void main(String[] args) {
        try {
            ExceptionExample_3.checkAge(15); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}