package Pertemuan14Tugas4;

public class DatabaseConnection {
    private static String connectionString;
    static {
        connectionString = "jdbc:mysql://localhost:3306/my_database";
        System.out.println("Inisialisasi connectionString telah dilakukan");
    }
    
    public static String getConnectionString() {
        return connectionString;
    }
}