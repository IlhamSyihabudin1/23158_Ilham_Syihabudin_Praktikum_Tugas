/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBOBuyuyun;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MatematikaCanggih mc = new MatematikaCanggih();
    int a = 5;
    int b = 3;

    System.out.println(a + " + " + b + " = " + mc.tambah(a, b));
    System.out.println(a + " * " + b + " = " + mc.kali(a, b)); 
    System.out.println(a + " - " + b + " = " + mc.kurang(a, b));
    System.out.println(a + " / " + b + " = " + mc.bagi(a, b));
    System.out.println(a + " % " + b + " = " + mc.modulus(a, b));
    }
    
}
