package Pertemuan6;

import java.util.ArrayList;
import java.util.List;

import Pertemuan6Latihan.Matakuliah;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    // hitung IPS
    public void hitungIPS() {
        double totalNilai = 0.0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalNilai += mk.getNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }

        if (totalSKS > 0) {
            ips = totalNilai / totalSKS;
        } else {
            ips = 0.0;
        }
    }

    //  setter and getter 
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }
}
