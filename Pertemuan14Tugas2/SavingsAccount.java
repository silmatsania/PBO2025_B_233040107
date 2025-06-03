package Pertemuan14Tugas2;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // ini akan menyebabkan COMPILE ERROR karena mencoba override final method
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Informasi Rekening Tabungan:");
        super.displayAccountInfo();
        System.out.println("Bunga: " + interestRate + "%");
    }
    */

    // solusi: membuat method baru dengan nama berbeda
    public void displaySavingsInfo() {
        displayAccountInfo(); 
        System.out.println("Bunga: " + interestRate + "%");
    }
}