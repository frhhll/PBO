import java.util.Scanner;

public class Konversi {

    int bulan, detik, menit, jam, hari;

    public void setBulan(int bulan){
        this.bulan = bulan;
    }

    public int getBulan(){
        return bulan;
    }

    public void konversiDetik(int bulan){
        this.detik = bulan * 30 * 24 * 60 * 60;
    }

    public int getDetik(){
        return this.detik;
    }

    public void konversiMenit(int bulan){
        this.menit = bulan + 30 * 24 * 60;
    }

    public int getMenit(){
        return this.menit;
    }

    public void konversiJam(int bulan){
        this.jam = bulan * 30 * 24;
    }

    public int getJam(){
        return this.jam;
    }

    public void konversiHari(int bulan){
        this.hari = bulan * 30;
    }

    public int getHari() {
        return this.hari;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Konversi data = new Konversi();

        System.out.print("Masukkan Bulan : ");
        data.setBulan(input.nextInt());

        input.close();

        data.konversiDetik(data.getBulan());
        data.konversiMenit(data.getBulan());
        data.konversiJam(data.getBulan());
        data.konversiHari(data.getBulan());

        System.out.println(" ===== Data Konversi ===== ");
        System.out.println(data.getBulan() + " Bulan Sama Dengan " + data.getDetik() + " Detik ");
        System.out.println(data.getBulan() + " Bulan Sama Dengan " + data.getMenit() + " Menit ");
        System.out.println(data.getBulan() + " Bulan Sama Dengan " + data.getJam() + " Jam ");
        System.out.println(data.getBulan() + " Bulan Sama Dengan " + data.getHari() + " Hari ");
    }
}
