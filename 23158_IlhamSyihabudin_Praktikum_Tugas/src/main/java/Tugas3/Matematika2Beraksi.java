/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3;

import Tugas_2.Matematika;

/**
 *
 * @author ASUS
 */
public class Matematika2Beraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Membuat objek dari class Matematika2
    Matematika2 matematika2 = new Matematika2();
    // Membuat objek dari class Matematika
    Matematika matematika = new Matematika();
    // Deklarasi variabel a dan b dengan nilai awal
    int a =20 , b =10 ;
    // Mencetak hasil penjumlahan a dan b menggunakan metode pertambahan dari kelas matematika
    System.out.println("Pertambahan: " + a + " + " + b + " = " + matematika.pertambahan(a, b));
    // Mencetak hasil pengurangan a dan b menggunakan metode pengurangan dari kelas matematika
    System.out.println("Pengurangan: " + a + " - " + b + " = " + matematika.pengurangan(a, b));
    // Mencetak hasil perkalian a dan b menggunakan metode perkalian dari kelas matematika
    System.out.println("Perkalian: " + a + " * " + b + " = " + matematika.perkalian(a, b));
    // Mencetak hasil pembagian a dan b menggunakan metode pembagian dari kelas matematika
    System.out.println("Pembagian: " + a + " / " + b + " = " + matematika.pembagian(a, b));
    // Mencetak hasil modulus a dan b menggunakan metode modulus dari kelas matematika2
    System.out.println("Modulus: " + a + " % " + b + " = " + matematika2.modulus(a, b));
    }
    
}
