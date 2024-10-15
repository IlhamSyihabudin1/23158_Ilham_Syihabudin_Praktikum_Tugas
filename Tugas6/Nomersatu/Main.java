/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6.Nomersatu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Bilangan_Prima myNum = new Bilangan_Prima();
        Genap myGenap = new Genap();
        Ganjil myGanjil = new Ganjil();
        Alphabet AZ = new Alphabet();
        
        int nAwal, nAkhir;

        System.out.println("Soal nomer 1 bagian a ");
        System.out.print("Masukkan nilai awal : ");
        nAwal = input.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        nAkhir = input.nextInt();
        
        myNum.setVar(nAwal, nAkhir);
        myNum.getOutput();
        
        System.out.println("\nSoal nomer 1 bagian b ");
        myGenap.getGenap();
        myGanjil.getGanjil();
        
        System.out.println("\nSoal nomer 1 bagian c ");
        AZ.getAlphabet();
        
        System.out.println("\n\nSoal nomer 1 bagian d ");
        System.out.print("Masukkan jumlah anak ayam yang anda inginkan : ");
        int jumAyam = input.nextInt();
        Lagu myLagu = new Lagu(jumAyam);
        myLagu.getOutput();
    } 
  }
