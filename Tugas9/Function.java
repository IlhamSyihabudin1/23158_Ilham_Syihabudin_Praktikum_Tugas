/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;


/**
 *
 * @author ASUS
 */
public class Function {

    String number = " ", op, sementara;
    double c;
    double b;
    double a;
    

        public void tambah(){
            c = a + b;
        }

        public void kurang(){
            c = a - b;
        }

        public void kali(){
            c = a * b;
        }

        public void bagi(){
            c = a / b;
        }

        public void mod(){
            c = a % b;
        }

        public void samaDengan(){
            switch(op){
                case "+":
                    tambah();
                    break;
                case "-":
                    kurang();
                    break;
                case "*":
                    kali();
                    break;
                case "/":
                    bagi();
                    break;
                case "%":
                    mod();
                    break;
            }
        }
    }
