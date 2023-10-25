package com.oracle;

import java.util.Scanner;

public class Main {

    int NilaiProgdas, NilaiKalkulus, NilaiOrkom;
    double Hasil;

    public void setNilaiProgdas(int nilai) {
        this.NilaiProgdas = nilai;
    }

    public int getNilaiProgdas() {
        return this.NilaiProgdas;
    }

    public void setNilaiKalkulus(int nilai) {
        this.NilaiKalkulus = nilai;
    }

    public int getNilaiKalkulus() {
        return this.NilaiKalkulus;
    }

    public void setNilaiOrkom(int nilai) {
        this.NilaiOrkom = nilai;
    }

    public int getNilaiOrkom() {
        return this.NilaiOrkom;
    }

    public double hitungRata(int a, int b, int c) {
        this.Hasil = (a + b + c) / 3;
        return this.Hasil;
    }

    public String cekNilai(Double nilai) {
        if (nilai >= 70) {
            return "LULUS";
        } else {
            return "GAGAL";
        }
    }


    public static void main(String[] args) {

        double Hasil;

        Scanner input = new Scanner(System.in);
        Main dataNilai = new Main();

        System.out.print("Nilai Progdas : ");
        dataNilai.setNilaiProgdas(input.nextInt());

        System.out.print("Nilai Kalkulus : ");
        dataNilai.setNilaiKalkulus(input.nextInt());

        System.out.print("Nilai Orkom : ");
        dataNilai.setNilaiOrkom(input.nextInt());

        input.close();

        System.out.println("");

        System.out.println("Nilai Anda : ");
        System.out.println("Progdas : " + dataNilai.getNilaiProgdas());
        System.out.println("Kalkulus : " + dataNilai.getNilaiKalkulus());
        System.out.println("Orkom : " + dataNilai.getNilaiOrkom());

        System.out.println("");

        Hasil = dataNilai.hitungRata(dataNilai.getNilaiProgdas(), dataNilai.getNilaiKalkulus(),
                dataNilai.getNilaiOrkom());

        System.out.println("Rata-Rata : " + Double.toString(Hasil));
        System.out.println("Status : " + dataNilai.cekNilai(Hasil));
    }
}
