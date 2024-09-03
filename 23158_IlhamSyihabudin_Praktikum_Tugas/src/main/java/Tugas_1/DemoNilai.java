/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_1;

/**
 *
 * @author ILHAM
 */
public class DemoNilai {//Membuat class Demo Nilai

    /**
     * Main class untuk menjalankan program
     */
    public static void main(String[] args) { //masuknya program
        Nilai nilaiMahasiswa = new Nilai(); //membuat kelas nilai 
        
        nilaiMahasiswa.NIM = "xxxxxxx"; //mengatur NIM (Nomor Induk Mahasiswa)dari mahasiswa
        nilaiMahasiswa.nama = "xxxxxxx"; //mengatur nama mahasiswa
        
        nilaiMahasiswa.Nilai(0, 0, 0, 0, 0); //memanggil metode nilai 
        nilaiMahasiswa.cetakNilai(); //memanggil cetak nilai untuk cetak nilainya keluar
    }
}