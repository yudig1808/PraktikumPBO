package com.yudigunawanpraktikumpbo6.YudiGunawan.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.print(" Masukkan Bilangan : ");
            int bilangan = input.nextInt();
            
            System.out.print(" Masukkan Pembagi : ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan / pembagi;
            
            System.out.println(" Hasil Pembagian (dibulatkan) : " + hasil);
        }
        
        catch(ArithmeticException e){
            System.out.println(" Tidak bisa membagi bilangan! ");
        }
        
        catch(InputMismatchException e){
            System.out.println(" Harap masukkan angka saja! ");
        }
    }
}