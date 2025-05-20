package Latihan1; 

public abstract class Bentuk {
    // Nilai PI digunakan sebagai konstanta untuk perhitungan luas
    protected double PI = 3.14;

    // Atribut jari2 menyimpan nilai jari-jari dari suatu bentuk
    protected int jari2;

    // Konstruktor: akan dipanggil saat objek dibuat
    // Menerima nilai jari-jari dan menyimpannya ke dalam atribut jari2
    public Bentuk(int jari2) {
        this.jari2 = jari2;
    }

    // Method abstrak luas() tidak memiliki isi di sini
    // Harus diimplementasikan oleh kelas turunannya
    public abstract double luas();

    // Method getter untuk mengambil nilai dari atribut jari2
    public double getJari2() {
        return jari2;
    }

    // Method setter untuk mengubah nilai jari2
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}
