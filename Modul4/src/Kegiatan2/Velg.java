package Kegiatan2;

public class Velg {

    private String model;
    private int ukuran;

    public Velg (String model, int ukuran){
        this.model = model;
        this.ukuran = ukuran;
    }

    public String getModel(){
        return model;
    }

    public int getUkuran(){
        return ukuran;
    }
}