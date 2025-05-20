package Latihan1;

public class MainAbstract {
    public static void main(String[] args) {
        
        // Membuat objek lingkaran dengan jari-jari 10
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        // Menampilkan nilai jari-jari
        System.out.println("jari2: " + lingkaran.getJari2());
        // Menampilkan hasil perhitungan luas lingkaran
        System.out.println("luas:" + lingkaran.luas());

        // Membuat objek tabung dengan jari-jari 10 dan tinggi 5
        Tabung tabung = new Tabung(10, 5);
        System.out.println("== Tabung ==");
        // Menampilkan nilai jari-jari dan tinggi tabung
        System.out.println("jari2: " + tabung.getJari2() + ", Tinggi:" + tabung.getTinggi());
        // Menampilkan hasil perhitungan luas permukaan tabung
        System.out.println("luas:" + tabung.luas());
    }
}
