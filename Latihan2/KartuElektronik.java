package Latihan2;

public class KartuElektronik implements Kartu {
    // Atribut untuk menyimpan kode bank dan PIN
    private String kodeBank;
    private String pin;

    // Konstruktor: digunakan untuk menginisialisasi nilai kode bank dan PIN
    public KartuElektronik(String kodeBank, String pin) {
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    // Implementasi method otentikasi dari interface Kartu
    // Mengecek apakah input PIN sama dengan PIN yang disimpan
    @Override
    public boolean otentikasi(String inputPin) {
        if (pin.equals(inputPin))
            return true;    // Jika cocok, kembalikan true
        else
            return false;   // Jika tidak cocok, kembalikan false
    }

    // Implementasi method encode dari interface Kartu
    // Menggabungkan kode bank dengan PIN untuk menghasilkan data yang terenkripsi secara sederhana
    @Override
    public String encode(String pin) {
        return kodeBank + "_" + pin;
    }
}
