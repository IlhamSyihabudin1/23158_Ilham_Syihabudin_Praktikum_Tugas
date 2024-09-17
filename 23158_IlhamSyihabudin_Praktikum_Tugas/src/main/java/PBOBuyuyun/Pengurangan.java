/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBOBuyuyun;

/**
 *
 * @author ASUS
 */
public class Pengurangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Deklarasi variabel x, y, dan z dengan tipe data integer
        int x, y, z;

        // Inisialisasi variabel x dengan nilai 42
        x = 42;

        // Assign nilai x ke y, kemudian x dikurangi 1
        y = x--;

        // Menampilkan nilai x dan y di konsol
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);

        // Mengurangi nilai x dengan 1 terlebih dahulu, kemudian assign hasilnya ke z
        z = --x;

        // Menampilkan nilai x dan z di konsol
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai z: " + z);
    }
    
}
