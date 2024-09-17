/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBOBuyuyun;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class KaliBagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        // Perkalian dengan 2 (tanpa operator *)
        int hasilKali = bilangan;
        for (int i = 1; i < 2; i++) {
            hasilKali += bilangan;
        }

        // Pembagian dengan 2 (tanpa operator /)
        int hasilBagi = bilangan;
        while (hasilBagi > 0) {
            hasilBagi -= 2;
        }
        int hasilBagiFinal = bilangan - hasilBagi;

        System.out.println("Hasil perkalian: " + hasilKali);
        System.out.println("Hasil pembagian: " + hasilBagiFinal);
    }
} 
    
