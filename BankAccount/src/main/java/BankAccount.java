public class BankAccount {
    // private instance variable 
    private double balance;
    private String accountNumber;
    private String ownerName;
    private static final double INTEREST_RATE = 0.01;
    // constructor na nag iinitialize nung balance, acc number, and owner name
    public BankAccount(double initialBalance, String accountNumber, String ownerName){
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    // deposit money sa account
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid");
        }
    }
    // withdraw money sa account
    public void withdrawMoney(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
        } else {
            System.out.println("Invalid");
        }
    }
    // method para ma check yung balance
    public double checkBalance() {
        return balance;
    }
    // getters and setters for balance, acc number, and owner name
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }
    // calculate interest earned
   public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    // Calculate interest earned over a specific number of years
    public double calculateInterest(int years) {
        return balance * INTEREST_RATE * years;
    }
}