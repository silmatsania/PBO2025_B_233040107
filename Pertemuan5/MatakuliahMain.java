package Pertemuan5;

//Kelas MatakuliahMain untuk instansiasi dan pengujian

import java.util.Scanner;

public class MatakuliahMain {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     Matakuliah mk = new Matakuliah();
     System.out.print("Masukkan kode matakuliah: ");
     mk.kode = input.nextLine();
     
     System.out.print("Masukkan nama matakuliah: ");
     mk.nama = input.nextLine();
     
     System.out.print("Masukkan jumlah SKS: ");
     mk.sks = input.nextInt();
     
     System.out.print("Masukkan nilai angka: ");
     mk.nilaiAngka = input.nextDouble();
     
     System.out.println("Nilai indeks: " + mk.nilaiIndex());
     input.close();
 	}
}
