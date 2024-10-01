/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class IMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat badan (dalam kg): ");
        double beratBadan = scanner.nextDouble();

        System.out.print("Masukkan tinggi badan (dalam m): ");
        double tinggiBadan = scanner.nextDouble();

        String kategori = hitungIMT(beratBadan, tinggiBadan);

        System.out.println("Kategori IMT Anda adalah: " + kategori);
    }

    public static String hitungIMT(double beratBadan, double tinggiBadan) {
        double imt = beratBadan / Math.pow(tinggiBadan, 2);

        if (imt < 18.4) {
            return "Barat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            return "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            return "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
}
  