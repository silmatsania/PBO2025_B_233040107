package Pertemuan14Tugas4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        System.out.println("URL Koneksi Database: " + DatabaseConnection.getConnectionString());
        System.out.println("Aplikasi siap menggunakan koneksi database");
    }
}