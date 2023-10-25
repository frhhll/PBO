/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

import javafx.beans.property.SimpleStringProperty;

public class Mahasiswa {
    
    private final SimpleStringProperty name;
    private final SimpleStringProperty nim;
    private final SimpleStringProperty alamat;
    private final SimpleStringProperty email;
    private final SimpleStringProperty fakultas;
    private final SimpleStringProperty jurusan;
    private final SimpleStringProperty kota;

    Mahasiswa(String name, String nim, String email, String fakultas, String jurusan, String alamat, String kota) {
        this.name = new SimpleStringProperty(name);
        this.nim = new SimpleStringProperty(nim);
        this.email = new SimpleStringProperty(email);
        this.fakultas = new SimpleStringProperty(fakultas);
        this.jurusan = new SimpleStringProperty(jurusan);
        this.alamat = new SimpleStringProperty(alamat);
        this.kota = new SimpleStringProperty(kota);
    }

    public void setName(String name){
        this.name.set(name);
    }

    public void setNim(String nim){
        this.nim.set(nim);
    }

    public void setEmail(String email){
        this.email.set(email);
    }

    public void setFakultas(String fakultas){
        this.fakultas.set(fakultas);
    }

    public void setJurusan(String jurusan){
        this.jurusan.set(jurusan);
    }

    public void setAlamat(String alamat){
        this.alamat.set(alamat);
    }

    public void setKota(String kota){
        this.kota.set(kota);
    }

    public String getName() {
        return name.get();
    }

    public String getNim() {
        return nim.get();
    }

    public String getEmail() {
        return email.get();
    }

    public String getFakultas() {
        return fakultas.get();
    }

    public String getJurusan() {
        return jurusan.get();
    }

    public String getAlamat() {
        return alamat.get();
    }

    public String getKota() {
        return kota.get();
    }
}