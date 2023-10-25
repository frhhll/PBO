package Kegiatan1dan2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        dinasPertanahan[] listTanah = new dinasPertanahan[5];
        char res = 'n';
        System.out.println("Silakan input data (harus 5) :");
        try {
            int i = 0;
            do {
                listTanah[i] = new dinasPertanahan();

                System.out.print("\nAlamat        : ");
                listTanah[i].setAlamat(scan.nextLine());

                System.out.print("Panjang tanah : ");
                listTanah[i].setPanjangTanah(scan.nextInt());

                System.out.print("Luas tanah    : ");
                listTanah[i].setLuasTanah(scan.nextInt());
                scan.nextLine();
                i++;

                System.out.print("\nApakah ingin input lagi? (y/n) : ");
                res = scan.nextLine().charAt(0);

            } while (res == 'y');
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error : Melebihi batas array");
        } catch (InputMismatchException e) {
            System.err.println("Error : Input tidak sesuai");
        } finally {
            scan.close();
        }

        File file = new File("Data Tanah.txt");

            // Menulis File TxT
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            try {
                for (int i = 0; i < listTanah.length; i++) {
                    fileWriter.write(listTanah[i].toString());
                }
            } catch (NullPointerException e) {
                System.out.println("Jumlah data tidak lengkap\n");
            }
            fileWriter.close();

            // Membaca File TxT
        } catch (IOException e) {
            System.out.println("Error : Tidak bisa membaca file");
        } finally {
            System.out.println("Data Tanah");
            for (int i = 0; i < listTanah.length; i++) {
                if (listTanah[i] != null) {
                    System.out.println(listTanah[i]);
                }
            }
        }
    }
}
