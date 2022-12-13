package com.yudigunawanpraktikumpbo2.praktikumpbo.pertemuan4.kendaraan;

public class Kendaraan {
    // Attribute (Variable)
    String nama;
    int jmlRoda;
    
    // Method (Fungsi)
    public void nyalakanMesin(){
        System.out.println(" Mesin " + nama + " telah dinyalakan! ");
        extraInfo();
    }
    
    public void showInfo(){
        System.out.println(" Nama " + nama);
        System.out.println(" Jumlah Roda " + jmlRoda);
        extraInfo();
    }
    
    public void extraInfo(){}
}
