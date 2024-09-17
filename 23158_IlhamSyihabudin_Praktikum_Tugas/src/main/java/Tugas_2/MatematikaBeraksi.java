/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_2;

/**
 *
 * @author ASUS
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika matematika = new Matematika();
        
    // Deklarasi variabel a dan b dengan nilai awal
    int a = 20, b = 10;
    // Mencetak hasil pertambahan a dan b menggunakan metode pertambahan dari kelas matematika
    System.out.println("Pertambahan: " + a + " + " + b + " = " + matematika.pertambahan(a, b));
    
    // Mengubah nilai a dan b
    a = 10;
    b = 5;
// Mencetak hasil pengurangan a dan b menggunakan metode pengurangan dari kelas matematika
    System.out.println("Pengurangan: " + a + " - " + b + " = " + matematika.pengurangan(a, b));
    
    // Mengubah nilai a dan b
    a = 10;
    b = 3;
// Mencetak hasil perkalian a dan b menggunakan metode perkalian dari kelas matematika
    System.out.println("Perkalian: " + a + " * " + b + " = " + matematika.perkalian(a, b));
    
    // Mengubah nilai a dan b
    a = 21;
    b = 2;
// Mencetak hasil perkalian a dan b menggunakan metode perkalian dari kelas matematika
    System.out.println("Pembagian: " + a + " / " + b + " = " + matematika.pembagian(a, b));
  }
 }

  