/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas4;

/**
 *
 * @author ASUS
 */
public class BangunRuangBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Balok balok = new Balok(9, 4, 6);
    System.out.println("Volume balok: " + balok.hitungVolume());
    System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());

    // Kubus
    Kubus kubus = new Kubus(4);
    System.out.println("Volume kubus: " + kubus.hitungVolume());
    System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());
    }
}
