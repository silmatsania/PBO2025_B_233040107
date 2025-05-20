package Latihan2;

public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik menggunakan referensi tipe interface Kartu
        // Diberikan kode bank "IF111" dan PIN "123"
        Kartu kartu = new KartuElektronik("IF111", "123");

        // Melakukan otentikasi dengan PIN "123"
        // Jika cocok, akan menghasilkan true; jika tidak, menghasilkan false
        System.out.println("Otentikasi : " + kartu.otentikasi("123"));
    }
}
