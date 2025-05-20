package Latihan2;

public interface Kartu {
    // Method otentikasi akan digunakan untuk memverifikasi PIN yang dimasukkan
    // Mengembalikan nilai true jika PIN sesuai, false jika tidak
    public boolean otentikasi(String pin);

    // Method encode digunakan untuk melakukan enkripsi atau pemrosesan PIN
    // Mengembalikan hasil enkripsi dalam bentuk String
    public String encode(String pin);
}
