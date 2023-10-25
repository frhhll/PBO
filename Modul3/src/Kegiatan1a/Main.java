package Kegiatan1a;

public class Main {

    public static void main(String[] args) {

        ParentPahlawan phlwn = new ParentPahlawan("Cut Nyak Dien", "Perempuan", "Aceh Besar", 1848);
        TahunWafat phlwn0 = new TahunWafat("Jenderal Soedirman", "Laki-Laki", "Bodas Karangjati", 1916,1950);

        System.out.println();
        System.out.println("=== Pahlawan Bangsa ===");
        System.out.println();
        phlwn.print();
        System.out.println();
        phlwn0.print();
        System.out.println();
    }
}
