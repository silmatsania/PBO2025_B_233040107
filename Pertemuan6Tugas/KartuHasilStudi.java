package Pertemuan6Tugas;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    // getter untuk daftar mata kuliah
    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    // setter untuk daftar mata kuliah
    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }

    public String getSemester() {
        return semester;
    }
}
