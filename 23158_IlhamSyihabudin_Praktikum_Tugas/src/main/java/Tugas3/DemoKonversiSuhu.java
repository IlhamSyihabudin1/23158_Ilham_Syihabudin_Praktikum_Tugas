/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3;

/**
 *
 * @author ASUS
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   KonversiSuhu konversiSuhu = new KonversiSuhu();
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        // Menampilkan hasil konversi suhu menggunakan kelas KonversiSuhu
        System.out.println("Konversi Suhu:");
        System.out.println("Celcius to Fahrenheit: " + konversiSuhu.celciusToFahrenheit(25));
        System.out.println("Celcius to Reamur: " + konversiSuhu.celciusToReamur(25));

        // Menampilkan hasil konversi suhu menggunakan kelas KonversiSuhu2
        System.out.println("\nKonversi Suhu 2:");
        System.out.println("Fahrenheit to Reamur: " + konversiSuhu2.fahrenheitToReamur(77));
    }
    
}
