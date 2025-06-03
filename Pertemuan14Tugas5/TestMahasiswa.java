package Pertemuan14Tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("123456", "Budi Santoso");
        Mahasiswa mhs2 = new Mahasiswa("654321", "Ani Wijaya");
        Mahasiswa mhs3 = new Mahasiswa("987654", "Citra Dewi");
        
        System.out.println("=== Informasi Mahasiswa ===");
        mhs1.displayInfo();
        System.out.println();
        mhs2.displayInfo();
        System.out.println();
        mhs3.displayInfo();
        
        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
        System.out.println("Batas Maksimum SKS untuk semua mahasiswa: " + Mahasiswa.MAX_SKS);
    }
}