/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8;

/**
 *
 * @author ASUS
 */
public class toko  {
private String[][] barang = {
        {
            "a001", "a002", "a003", "a004", "a005"
        },
        {
            "Pensil", "Pulpen", "Buku", "Tas", "Binder"
        }
    };
    
    private int[] hargaBarang = {2000, 3000, 5000, 30000, 25000};
    
    public String[][] getBarang(){
        return this.barang;
    }
    
    public int[] getHargaBarang(){
        return this.hargaBarang;
    }
}

