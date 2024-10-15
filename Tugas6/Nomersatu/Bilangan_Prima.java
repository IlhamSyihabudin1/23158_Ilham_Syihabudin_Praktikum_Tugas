/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6.Nomersatu;

/**
 *
 * @author ASUS
 */
public class Bilangan_Prima {
    private int nAwal, nAkhir, total;
    
    public void setVar(int awal, int akhir){
        this.nAwal = awal;
        this.nAkhir = akhir;
    }
    
    public boolean getPrima(int angka){
        // Bilangan prima harus lebih besar dari 1
        if (angka <= 1) {
            return false;
        }
        
        // Loop untuk memeriksa faktor-faktor bilangan
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            // Jika ditemukan faktor selain 1 dan angka itu sendiri, bukan bilangan prima
            if (angka % i == 0) {
                return false;
            }
        }
        // Jika tidak ditemukan faktor selain 1 dan angka itu sendiri, adalah bilangan prima
        return true;
    }
    
    public void getOutput(){
        System.out.println("Bilangan prima antara 1 sampai " + this.nAkhir + " adalah:");
        for (int i = this.nAwal; i <= this.nAkhir; i++) {
            if (getPrima(i)) {
                System.out.print(i + " ");
                total += i;
            }
        }
        System.out.println("Hasil totalnya adalah " + total);
    } 
}
