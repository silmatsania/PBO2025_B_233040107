package Pertemuan6Latihan;

public class Mahasiswa {
    private String NRP;
    private String nama;

    public Mahasiswa() {

    }

    public Mahasiswa(String NRP, String nama) {
        this.NRP = NRP;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + NRP + ", Nama: " + nama;
    }

    // Getter dan Setter untuk NRP
    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    // Getter dan Setter untuk Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
