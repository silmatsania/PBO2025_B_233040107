package Pertemuan5;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama mahasiswa: ");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = input.nextLine();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        mahasiswa.matakuliah = new Matakuliah[jumlahMK];
        
        for (int i = 0; i < jumlahMK; i++) {
            mahasiswa.matakuliah[i] = new Matakuliah();
            input.nextLine(); // Clear buffer
            
            System.out.print("Masukkan kode matakuliah ke-" + (i+1) + ": ");
            mahasiswa.matakuliah[i].kode = input.nextLine();
            
            System.out.print("Masukkan nama matakuliah: ");
            mahasiswa.matakuliah[i].nama = input.nextLine();
            
            System.out.print("Masukkan jumlah SKS: ");
            mahasiswa.matakuliah[i].sks = input.nextInt();
            
            System.out.print("Masukkan nilai angka: ");
            mahasiswa.matakuliah[i].nilaiAngka = input.nextDouble();
        }
        
        System.out.println("IPK: " + mahasiswa.hitungIPK());
        input.close();
    }
}