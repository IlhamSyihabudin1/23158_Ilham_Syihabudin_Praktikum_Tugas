/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);

    System.out.print("NPM: ");
    String npm = scanner.next();

    System.out.print("Nama Mahasiswa: ");
    String nama = scanner.next();

    System.out.print("Nilai Kehadiran: ");
    int nilaiKehadiran = scanner.nextInt();

    System.out.print("Nilai Tugas: ");
    int nilaiTugas = scanner.nextInt();

    System.out.print("Nilai UTS: ");
    int nilaiUTS = scanner.nextInt();

    System.out.print("Nilai UAS: ");
    int nilaiUAS = scanner.nextInt();

    double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

    String grade;
    String keterangan;

    if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
      grade = "E";
      keterangan = "KURANG SEKALI";
    } else if (nilaiAkhir > 45 && nilaiAkhir <= 55) {
      grade = "D";
      keterangan = "KURANG";
    } else if (nilaiAkhir > 55 && nilaiAkhir <= 65) {
      grade = "C";
      keterangan = "CUKUP";
    } else if (nilaiAkhir > 65 && nilaiAkhir <= 75) {
      grade = "B";
      keterangan = "BAIK";
    } else {
      grade = "A";
      keterangan = "LUARBIASA";
    }

    System.out.println("NPM Mahasiswa: " + npm);
    System.out.println("Nama Mahasiswa: " + nama);
    System.out.println("Nilai Akhir: " + nilaiAkhir);
    System.out.println("Grade: " + grade);
    System.out.println("Keterangan: " + keterangan);
  }
}

