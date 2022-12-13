package com.yudigunawanpraktikumpbo6.YudiGunawan.Pertemuan6.Tugas;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String alamat;
        
        try{
            System.out.print(" Masukkan Alamat Anda : ");
            String alamat = input.nextLine();
            System.out.println(" Alamat Anda : " + alamat);
        }catch(RuntimeException e){
            System.out.println(" Terjadi kesalahan!");
        }
}