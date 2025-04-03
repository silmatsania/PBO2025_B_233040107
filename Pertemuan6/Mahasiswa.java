package Pertemuan6;

public class Mahasiswa {
    private String nrp;
    private String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + nrp + ", Nama: " + nama;
    }

    // setter dan getter untuk NRP
    public String getNRP() {
        return nrp;
    }

    public void setNRP(String NRP) {
        this.nrp = NRP;
    }

    // setter dan getter untuk Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
