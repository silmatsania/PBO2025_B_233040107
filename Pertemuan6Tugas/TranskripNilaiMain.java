package Pertemuan6Tugas;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // membuat objek matakuliah dengan dosen
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3, "Fajar Darmawan, S.T., M.Kom.");
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3, "Dr.Ir Leony Lidya, M.T ");
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3, "Siroj Nur Ulum, S.T., M.T.");

        // membuat objek KHS untuk Semester 2 (hanya Algoritma 1)
        KartuHasilStudi khsSemester2 = new KartuHasilStudi("2022");
        khsSemester2.addMatakuliah(mk1);
        khsSemester2.addMatakuliah(mk2);
        khsSemester2.addMatakuliah(mk3);

        // membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // membuat objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khsSemester2);

        // menghitung IPK
        transkrip.hitungIPK();

        // menampilkan transkrip nilai
        transkrip.display();
    }
}
