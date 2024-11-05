/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class InputDataMahasiswa {
     ArrayList<Mahasiswa> listmahasiswa;
        public InputDataMahasiswa() { 
        listmahasiswa = new ArrayList (); 
        }
        
        //Method untuk menambahkan data baru kedalam array list
        public void insertData(String NIM, String Nama, String Alamat, String Matkul, double nilaiAkhir) { 
            Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, Matkul, nilaiAkhir); 
            listmahasiswa.add(mhs); 
        }
       
        public ArrayList<Mahasiswa> getALL() { 
            return listmahasiswa; 
        }
       
        public void deleteData(int index) {
           if (index >= 0 && index < listmahasiswa.size()) {
           listmahasiswa.remove(index);
        }
    } 
}
