package Pertemuan4;

//Referensi Objek > 1 Variabel
class Objeklebihdari1 {
 public static void main(String[] args) {
     Lingkaran l1 = new Lingkaran(5);
     Lingkaran l2 = l1;
     Lingkaran l3 = l1;
     System.out.println(l1.getJari2()); // 5
     System.out.println(l2.getJari2()); // 5
     System.out.println(l3.getJari2()); // 5
     l2.setJari2(10);
     System.out.println(l1.getJari2()); // 10
     System.out.println(l2.getJari2()); // 10
     System.out.println(l3.getJari2()); // 10
 }
 
}



