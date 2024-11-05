/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author LENOVO
 */
public class HitungHari {       
    public long hitung(int tahun, int bulan){
        YearMonth tahunBulan = YearMonth.of(tahun, bulan);
        long jumlahHari = tahunBulan.lengthOfMonth();
        
        return jumlahHari;
    }
    
    public String checkIndexBulan(int index){
        String bulan = "";
        switch(index){
            case 0:
                bulan = "Januari";
                break;
            case 1:
                bulan = "Februari";
                break;
            case 2:
                bulan = "Maret";
                break;
            case 3:
                bulan = "April";
                break;
            case 4:
                bulan = "Mei";
                break;
            case 5:
                bulan = "Juni";
                break;
            case 6:
                bulan = "Juli";
                break;
            case 7:
                bulan = "Agustus";
                break;
            case 8:
                bulan = "September";
                break;
            case 9:
                bulan = "Oktober";
                break;
            case 10:
                bulan = "November";
                break;
            case 11:
                bulan = "Desember";
                break;
        }
        
        return bulan;
    }
    
     public static void saveTextToFile(String textToSave) {
        try {
            // Ganti path dengan lokasi dan nama file yang Anda inginkan
            File file = new File("D://UNSIKA//Tugas//kuliah//smt 3//PBO//pertemuan 3//Praktikum8(1)//src//tugasP8/teks.txt");

            // Membuat FileWriter untuk menulis ke file
            FileWriter fileWriter = new FileWriter(file);

            // Membuat BufferedWriter untuk menulis teks ke FileWriter
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Menulis teks dari JTextField ke file
            writer.write(textToSave);

            // Menutup BufferedWriter
            writer.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan file: " + e.getMessage());
        }
    }
   }

