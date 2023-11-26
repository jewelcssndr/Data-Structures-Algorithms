import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nag gawa ako ng bank account object
        BankAccount account = new BankAccount(9999.0, "123456789", "Jewel Paira");

        // para ma display yung initial account information
        System.out.println("Initial Account Information:");
        displayAccountInfo(account);

        // para sa deposit money money money
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.depositMoney(depositAmount);
        displayAccountInfo(account);

        // para sa withdraw money money money
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdrawMoney(withdrawAmount);
        displayAccountInfo(account);

        // para ma change yung name ng owner
        scanner.nextLine();
        System.out.print("Enter new owner's name: ");
        String newOwnerName = scanner.nextLine();
        account.setOwnerName(newOwnerName);
        System.out.println("Owner's Name Updated");

        // sa calculate and display interest earned
        System.out.println("Interest Earned: " + account.calculateInterest());

        // sa calculate and display interest earned over a specific number of years
        System.out.print("Enter the number of years to calculate interest: ");
        int years = scanner.nextInt();
        System.out.println("Interest Earned over " + years + " years: " + account.calculateInterest(years));

        scanner.close();
    }

    // ito ay method para ma display yung account info
    private static void displayAccountInfo(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner's Name: " + account.getOwnerName());
        System.out.println("Current Balance: " + account.checkBalance());
        System.out.println();
    }
}