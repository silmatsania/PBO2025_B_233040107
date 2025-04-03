package Pertemuan6Latihan;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
//    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah mk) {
        daftarMatakuliah.add(mk);
    }

//    public List<Matakuliah> getDaftarMatakuliah() {
//        return daftarMatakuliah;
//    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester: ").append(semester).append("\n");
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display()).append("\n");
        }
        return sb.toString();
    }
}



