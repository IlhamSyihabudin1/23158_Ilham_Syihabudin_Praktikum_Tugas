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
public class KalkulatorDiskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);

    // Tampilkan pesan untuk pengguna memasukkan total pembelian
    System.out.print("Total pembelian Rp. = ");
    int totalPembelian = scanner.nextInt();

    // Hitung diskon dan jumlah yang harus dibayarkan
    double diskon;
    if (totalPembelian < 50000) {
      diskon = totalPembelian * 0.05;
    } else {
      diskon = totalPembelian * 0.20;
    }
    double jumlahYangHarusDibayarkan = totalPembelian - diskon;

    // Tampilkan hasil
    System.out.println("Besarnya potongan Rp. = " + (int) diskon);
    System.out.println("Jumlah yang harus dibayarkan Rp. = " + (int) jumlahYangHarusDibayarkan);
  }
}