package Pertemuan5;

import java.util.Scanner;

public class GelasMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Gelas gelas1 = new Gelas();
        
        System.out.print("Masukkan warna gelas: ");
        gelas1.warna = input.nextLine();
        
        System.out.print("Masukkan volume gelas: ");
        gelas1.volume = input.nextInt();
        input.nextLine(); // Membersihkan buffer
        
        System.out.println("Warna awal gelas: " + gelas1.warna);
        
        System.out.print("Masukkan warna baru: ");
        String warnaBaru = input.nextLine();
        gelas1.tukarWarnaGelas(warnaBaru);
        
        System.out.println("Warna setelah ditukar: " + gelas1.warna);
        input.close();
    }
}

