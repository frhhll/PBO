package Kegiatan1dan2;

public class dinasPertanahan {

    private String alamat;
    private int panjangTanah;
    private int luasTanah;

    public dinasPertanahan() {
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getPanjangTanah() {
        return panjangTanah;
    }

    public void setPanjangTanah(int panjangTanah) {
        this.panjangTanah = panjangTanah;
    }

    public int getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(int luasTanah) {
        this.luasTanah = luasTanah;
    }

    public String toString() {
        return    "Alamat        : " + getAlamat() +
                "\nPanjang Tanah : " + getPanjangTanah() + " m" +
                "\nLuas Tanah    : " + getLuasTanah() + " m\n\n";
    }
}
