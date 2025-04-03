package Pertemuan6Latihan;

public class Matakuliah {
    private String kode;
    private String nama;
    private String huruf;
    private int sks;

    public Matakuliah(String kode, String nama, String huruf, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.huruf = huruf;
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public double getNilai() {
        switch (huruf) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public String display() {
        return kode + " - " + nama + " - " + huruf + " - " + sks;
    }
}


