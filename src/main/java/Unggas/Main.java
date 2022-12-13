package Unggas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char ulang;
        do{
            System.out.println("===================");
            System.out.println("|Menu Hewan Unggas|");
            System.out.println("===================");
            System.out.println("1. Angsa ");
            System.out.println("2. Ayam ");
            System.out.print(" Masukkan pilihan Unggas : ");
            int pilihan= input.nextInt();

        switch (pilihan){
            case 1:
                Angsa as = new Angsa();
                
                //Nilai attribute
                as.nama = "Toto";
                as.warnaBulu = "Putih";
                as.usia = 2;
                as.ukuran = 15;
                as.jriKaki = "Berselaput";
        
                //Method
                as.showInfo();
                as.bernafas("paru-paru");
                as.terbang();
                as.berenang();
            break;
            case 2:
                Ayam am = new Ayam();
                
                //Nilai attribute
                am.nama = "Rembo";
                am.warnaBulu = "Hitam Oren";
                am.usia = 3;
                am.ukuran = 10;
                am.bntkEkor = "Kuncup";
                
                //Method
                am.showInfo();
                am.bernafas("paru-paru");
                am.berkokok();
            break;
            default:
                System.out.println(" Error: Tidak ada pada menu! ");
        }
        System.out.print(" Ingin memilih menu lain (y/n)? ");
        ulang = input.next().charAt(0);
    }while (ulang != 'n');
        System.out.println(" MATURSUWUN!! ");
  }
}