package Pertemuan5;

//Latihan 2: Kelas Matakuliah

class Matakuliah {
 String kode;
 String nama;
 int sks;
 double nilaiAngka;
 
 char nilaiIndex() {
     if (nilaiAngka >= 80) return 'A';
     else if (nilaiAngka >= 70) return 'B';
     else if (nilaiAngka >= 60) return 'C';
     else if (nilaiAngka >= 50) return 'D';
     else return 'E';
 	}
}