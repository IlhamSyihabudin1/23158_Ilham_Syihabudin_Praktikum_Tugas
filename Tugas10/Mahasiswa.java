/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {

    private String NIM, Nama, Alamat, Matkul;
    private double nilaiAkhir;
   
    public Mahasiswa(String NIM, String Nama, String Alamat, String Matkul, double nilaiAkhir) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Matkul = Matkul;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public String getAlamat() {
        return Alamat;
    }
   
    public String getNIM() {
        return NIM;
    }
    
    public String getNama() {
        return Nama;
    }

    public String getMatkul(){
        return Matkul;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
}
