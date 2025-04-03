package Pertemuan5;

//Latihan 3: Perhitungan IPK

class Mahasiswa {
 String nama;
 Matakuliah[] matakuliah;
 
 double hitungIPK() {
     double totalBobot = 0;
     int totalSKS = 0;
     
     for (Matakuliah mk : matakuliah) {
         double bobot;
         switch (mk.nilaiIndex()) {
             case 'A': bobot = 4.0; break;
             case 'B': bobot = 3.0; break;
             case 'C': bobot = 2.0; break;
             case 'D': bobot = 1.0; break;
             default: bobot = 0.0; 
         }
         totalBobot += bobot * mk.sks;
         totalSKS += mk.sks;
     }
     return totalBobot / totalSKS;
 	} 
}
