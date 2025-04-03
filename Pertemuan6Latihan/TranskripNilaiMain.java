package Pertemuan6Latihan;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Membuat objek matakuliah
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Membuat objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("2022");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        // Membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // Membuat objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);

        // Menghitung IPK
//        transkrip.hitungIPK();

        // Menampilkan Transkrip Nilai
        transkrip.display();
    }
}


