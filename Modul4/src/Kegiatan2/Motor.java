package Kegiatan2;

public class Motor {
    private Velg velg;
    private String warna;

    void setWarna(String warna){
        this.warna = warna;
    }

    void setVelg(String model, int ukuran){

        velg = new Velg(model, ukuran);
    }

    public String getWarna(){
        return warna;
    }

    public String getModelVelg(){
        return velg.getModel();
    }

    public int getUkuranVelg(){
        return velg.getUkuran();
    }
}