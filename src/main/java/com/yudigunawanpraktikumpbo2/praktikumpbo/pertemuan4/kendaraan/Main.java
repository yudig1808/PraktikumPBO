package com.yudigunawanpraktikumpbo2.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        // Pembuatan Object
        // Class Object = new Class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Traktor tr = new Traktor();
        
        // Memasukkan Nilai Attribute
        mb.nama = " Toyota ";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = " Kendaraan Misterius ";
        kn.jmlRoda = 3;
        
        tr.nama = " Matsumoto ";
        tr.jmlRoda = 6;
        tr.dayaAngkut = 50;
        
        
        // Uji coba pemanggilan method
        mb.showInfo();
        mb.belok(" Kanan ");
        mb.belok();
      
        kn.showInfo();
        
        tr.membajakPadi(" Kedepan ");
        tr.membajakPadi();
        tr.showInfo();
    }
}
