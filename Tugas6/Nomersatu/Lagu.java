/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6.Nomersatu;

/**
 *
 * @author ASUS
 */
public class Lagu {
    private int jumlahAnakAyam;
    
    public Lagu(int jumlah){
        this.jumlahAnakAyam = jumlah;
    }
    
    public void getOutput(){
        System.out.println("Lagu Anak Ayam");

        for (int i = jumlahAnakAyam; i > 0; i--) {
            System.out.println("Mati satu tinggal "+ i);
        }

        System.out.println("Mati satu tinggal induknya");
        System.out.println("Mati semuaaaa~~~");
    }    
    
}
