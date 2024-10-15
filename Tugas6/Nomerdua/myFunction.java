/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6.Nomerdua;

/**
 *
 * @author ASUS
 */
public class myFunction {
     private int n;
    
    public myFunction(int x){
        this.n = x;
    }
    
    public void getOutput(){
        System.out.print("  ");
        for(int i = 1; i <= this.n; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for(int j = 1; j <= this.n; j++){
            if(j > 1){
                System.out.print("\n");
            }
            System.out.print(j + " ");
            for(int k = j; k <= this.n*j; k++){
                        if(k % j == 0){
                           System.out.print(k + " "); 
                        }      
            }
        }
    }
}
