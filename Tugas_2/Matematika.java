/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_2;

/**
 *
 * @author ASUS
 */
public class Matematika implements interfaceMatematika {
    // Class Matematika.java
  // Metode untuk menghitung penjumlahan dua angka
  // Mengambil dua parameter integer a dan b, lalu mengembalikan hasil penjumlahan a + b
  public int pertambahan(int a, int b) {
    return a + b;
  }
  // Metode untuk menghitung pengurangan dua angka
 // Mengambil dua parameter integer a dan b, lalu mengembalikan hasil pengurangan a - b
  public int pengurangan(int a, int b) {
    return a - b;
  }
  // Metode untuk menghitung perkalian dua angka
 // Mengambil dua parameter integer a dan b, lalu mengembalikan hasil perkalian a * b
  public int perkalian(int a, int b) {
    return a * b;
  }
  // Metode untuk menghitung pembagian dua angka
    // Mengambil dua parameter integer a dan b, lalu mengembalikan hasil pembagian a / b
    // Pembagian ini tidak menangani kemungkinan pembagian dengan 0, yang dapat menyebabkan ArithmeticException
  public int pembagian(int a, int b) {
    return a / b;
    }
}
  
