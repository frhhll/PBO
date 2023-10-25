package Kegiatan1a;

public class ParentPahlawan {

    public String nama;
    public String jenisKelamin;
    public String asalDaerah;
    public Integer tahunLahir;

    public ParentPahlawan(String nama) {
        this.nama = nama;
    }

    public ParentPahlawan(String nama, String jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    public ParentPahlawan(String nama, String jenisKelamin, String asalDaerah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.asalDaerah = asalDaerah;
    }

    public ParentPahlawan(String nama, String jenisKelamin, String asalDaerah, Integer tahunLahir) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.asalDaerah = asalDaerah;
        this.tahunLahir = tahunLahir;
    }

    public void print(){
        System.out.println("Nama Pahlawan : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Asal Daerah   : " + asalDaerah);
        System.out.println("Tahun Lahir   : " + tahunLahir);
    }
}
