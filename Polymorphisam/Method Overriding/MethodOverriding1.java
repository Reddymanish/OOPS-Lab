class Bank {
    double getInterestRate() {
        return 2.0;  // Default interest rate
    }
}

class SavingsAccount extends Bank {
    double getInterestRate() {
        return 4.5;  // Savings account rate
    }
}

class FixedDeposit extends Bank {
    double getInterestRate() {
        return 6.5;  // Fixed deposit rate
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank savings = new SavingsAccount();
        Bank fixed = new FixedDeposit();
       
        System.out.println("Bank Interest Rate: " + bank.getInterestRate() + "%");
        System.out.println("Savings Account Interest Rate: " + savings.getInterestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate: " + fixed.getInterestRate() + "%");
    }
}


