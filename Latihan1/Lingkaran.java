package Latihan1;

public class Lingkaran extends Bentuk {
    // Konstruktor kelas Lingkaran
    // Memanggil konstruktor dari kelas induk (Bentuk) dan mengirimkan nilai jari-jari
    public Lingkaran(int jari2) {
        super(jari2);
    }

    // Implementasi method abstrak luas() dari kelas Bentuk
    // Menghitung luas lingkaran dengan rumus: π × r × r
    @Override
    public double luas() {
        return PI * jari2 * jari2;
    }

    // Method untuk mengambil nilai jari-jari (getter)
    public double getJari2() {
        return jari2;
    }

    // Method untuk mengubah nilai jari-jari (setter)
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}
