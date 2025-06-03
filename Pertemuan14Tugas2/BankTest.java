package Pertemuan14Tugas2;

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", 1000000);
        SavingsAccount acc2 = new SavingsAccount("654321", 2000000, 0.5);

        acc1.deposit(500000);
        acc1.displayAccountInfo();

        acc2.deposit(1000000);
        acc2.displaySavingsInfo(); 
    }
}