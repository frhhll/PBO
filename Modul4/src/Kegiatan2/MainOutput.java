package Kegiatan2;

public class MainOutput {
    public static void main(String[] args) {
        Motor data = new Motor();

        data.setWarna("Hitam");
        data.setVelg("Palang 5",14);

        System.out.println("");
        System.out.println("======= Yamaha MT-15 =======");
        System.out.println("Warna Motor      : "+data.getWarna());
        System.out.println("Model Velg Motor : "+data.getModelVelg());
        System.out.println("Ukuran Velg      : "+data.getUkuranVelg());
        System.out.println("============================");
    }
}
