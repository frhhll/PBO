package com.modull;

import java.util.Scanner;

public class Mahasiswa {
    private String Nama;
    private String NIM;
    private String Password;

    Scanner keyboard = new Scanner(System.in);

    public void setNama(String nama) {
        this.Nama = nama;
    }
    public String getNama()
        {return Nama;}


    public void setNim(String nim) {
        this.NIM = nim;
    }
    public String getNim()
        {return NIM;}


    public void setPassword(String password) {
        this.Password = password;
    }
    public String getPassword()
        {return Password;}


    void login() {
        System.out.println("=====Daftar=====");
        System.out.print("Nama : ");
            String Nama = keyboard.nextLine();
                setNama(Nama);

        boolean isNIM = true;
        do {System.out.print("NIM : ");
            String NIM = keyboard.next();
            try{
                Long.parseLong(NIM);
                if(NIM.length() == 15){
                    setNim(NIM);
                    isNIM = false;
                }else {
                    System.out.println("NIM Harus Berjumlah 15 Angka");
                }
            }catch(NumberFormatException e){
                System.out.println("NIM Harus Berjumlah 15 Angka");
            }
        }while (isNIM);

        boolean isPassword = true;
        do {System.out.print("Password : ");
            String Password = keyboard.next();
                setPassword(Password);
            try{
                if(Password.length() == 8){
                    isPassword = false;
                }else {
                    System.out.println("Password Minimal 8 Karakter");
                }
            }catch(NumberFormatException e){
                System.out.println("Password Minimal 8 Karakter");
            }
        }while (isPassword);


        System.out.println("");
        System.out.println("Selamat " + Nama + " Anda Berhasil Daftar");
        System.out.println("");
        System.out.println("Berikut Username dan Password Anda : ");
        System.out.println("Username : " + NIM);
        System.out.print("Password : " + Password);
    }

    public static void main(String[] args) {
        Mahasiswa user = new Mahasiswa();
        user.login();
    }
}