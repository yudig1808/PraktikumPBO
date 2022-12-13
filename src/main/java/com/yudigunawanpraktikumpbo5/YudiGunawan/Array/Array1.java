package com.yudigunawanpraktikumpbo5.YudiGunawan.Array;

public class Array1 {
    public static void main(String[] args) {
        // pembuatan array
        String[] nama = new String[5];
        
        // cek panjang array
        System.out.println(" Panjang Array : " + nama.length);
        
        // memasukkan nilai ke array
        nama[0] = " Yura ";
        nama[1] = " Rayu ";
        nama[2] = " Yurara ";
        
        
        // menampilkan semua nilai array
        for (int i = 0; i < nama.length; i++) {
            System.out.println(i + ":" + nama[i]);
        }
    }
   
}