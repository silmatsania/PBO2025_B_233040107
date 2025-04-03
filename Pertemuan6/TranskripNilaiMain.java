package Pertemuan6;

import Pertemuan6Latihan.Matakuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // membuat objek matakuliah
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // membuat objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("20222");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        // membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // membuat objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);

        // menghitung IPK
        transkrip.hitungIPK();

        // menampilkan transkrip nilai
        transkrip.display();
    }
}

