/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_1;

/**
 *
 * @author ILHAM
 */
public class Nilai {
    String NIM, nama; //Deklarasi tipe data untuk nama dan NIM
    double absen, tugas, UTS, UAS, akhir; //Deklarasi variabel untuk menyimpan nilai
    
    //Metode untuk mengatur nilai
    void Nilai(int inputAbsen, int inputTugas, int inputUTS, int inputUAS, int inputAkhir){
        this.absen = inputAbsen; //mengatur nilai absen
        this.tugas = inputTugas; //mengatur nilai tugas
        this.UTS = inputUTS; //mengatur nilai uts
        this.UAS = inputUAS; //mengatur nilai uas
        
        //menghitung nilai akhir dengan rumus 
        this.akhir = this.absen*(0.1) + this.tugas*(0.2) + this.UTS*(0.3) + this.UAS*(0.4);
    }
    
    //metode untuk mencetak nilai
    void cetakNilai(){
        System.out.println("NIM : " + this.NIM); //mencetak NIM
        System.out.println("Nama : " + this.nama); //mencetak nama
        System.out.println("Nilai Absen[10%] : "+ this.absen); //mencetak absen
        System.out.println("Nilai Tugas[20%] : "+ this.tugas); //mencetak tugas
        System.out.println("Nilai UTS[30%] : "+ this.UTS); //mencetak uts
        System.out.println("Nilai UAS[40%] : "+ this.UAS); //mencetak uas
        System.out.println("Nilai Akhir : "+ this.akhir); //mencetak nilai akhir
    }
}