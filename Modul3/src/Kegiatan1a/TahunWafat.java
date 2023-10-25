package Kegiatan1a;

public class TahunWafat extends ParentPahlawan {

    public int meninggal;

    public TahunWafat(String nama, int meninggal) {
        super(nama);
        this.meninggal = meninggal;
    }

    public TahunWafat(String nama, String jenisKelamin, int meninggal) {
        super(nama, jenisKelamin);
        this.meninggal = meninggal;
    }

    public TahunWafat(String nama, String jenisKelamin, String asalDaerah, int meninggal) {
        super(nama, jenisKelamin, asalDaerah);
        this.meninggal = meninggal;
    }

    public TahunWafat(String nama, String jenisKelamin, String asalDaerah, Integer tahunLahir, int meninggal) {
        super(nama, jenisKelamin, asalDaerah, tahunLahir);
        this.meninggal = meninggal;
    }

    public void print(){
        super.print();
        System.out.println("Tahun Wafat   : " + meninggal);
    }
}
