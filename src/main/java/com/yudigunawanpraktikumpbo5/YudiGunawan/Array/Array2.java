package com.yudigunawanpraktikumpbo5.YudiGunawan.Array;

public class Array2 {
    public static void main(String[] args) {
        // pembuatan array
        String[] nama = {" Yura ", " Rayu ", " Yurara "}; 
        
        // cek panjang array
        System.out.println(" Panjang Array : " + nama.length);
        
        
        // menampilkan semua nilai array
        for (int i = 0; i < nama.length; i++) {
            System.out.println(i + ":" + nama[i]);
        }
    }
}
