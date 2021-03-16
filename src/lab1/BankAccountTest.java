package lab1;
import java.util.*;
public class BankAccountTest {
    public static <SavingsAccount> void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your bank account number: ");
        BankAccount savings = new BankAccount(1000, 0.10);
        savings.withdraw(600);
        savings.deposit(600);
        savings.addInterest();
        System.out.println(savings.getBalance());
    }
}
