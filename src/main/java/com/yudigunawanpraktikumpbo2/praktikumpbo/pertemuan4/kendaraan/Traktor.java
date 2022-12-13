package com.yudigunawanpraktikumpbo2.praktikumpbo.pertemuan4.kendaraan;

public class Traktor extends Kendaraan {
    int dayaAngkut;
    
    public void membajakPadi(String arah){
        System.out.println(" Traktor " + nama + " Membajak Sawah ke " + arah + "!");
    }
    
    public void membajakPadi(){
        System.out.println(" Eror : Mohon Masukkan Arah! ");
    }
    
    public void extraInfo(){
        System.out.println(" Daya Angkut : " + dayaAngkut);
    }
}
