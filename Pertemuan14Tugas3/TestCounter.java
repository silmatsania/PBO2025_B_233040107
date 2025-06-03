package Pertemuan14Tugas3;

public class TestCounter {
    public static void main(String[] args) {
        System.out.println("Jumlah awal instance: " + Counter.getInstanceCount());
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        System.out.println("Jumlah instance setelah pembuatan 3 objek: " 
            + Counter.getInstanceCount());
            
        new Counter(); 
        new Counter(); 
        
        
        System.out.println("Total instance akhir: " + Counter.getInstanceCount());
    }
}