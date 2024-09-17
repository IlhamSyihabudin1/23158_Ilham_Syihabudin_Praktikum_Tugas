/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBOBuyuyun;

/**
 *
 * @author ASUS
 */
public class Pengurangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int w, x, y, z;
        x = 5;
        w = 5;
        y = 8 - x--; // x = 4, y = 4
        z = 8 - --w; // w = 4, z = 4
        System.out.println("x: " + x); 
        System.out.println("y: " + y);
        System.out.println("w: " + w);
        System.out.println("z: " + z);
    }
    
}
