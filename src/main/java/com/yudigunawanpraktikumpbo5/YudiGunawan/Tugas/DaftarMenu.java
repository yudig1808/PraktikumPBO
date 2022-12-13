package com.yudigunawanpraktikumpbo5.YudiGunawan.Tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DaftarMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader(System.in));
        int i = 0;
        int hargaTotal = 0;
        int penampung = 0;
        String menu[] = new String[100];
        int harga[] = new int[100];
        String keputusan = "y";

        System.out.println("==================");
        System.out.println("| Daftar Menu RY |");
        System.out.println("==================");
        System.out.println("1. Seblak = Rp 15000 ");
        System.out.println("2. Bakso = Rp 25000 ");
        System.out.println("3. Mie Goreng = Rp 10000 ");
        while (keputusan.equals("y")||keputusan.equals("y")){
            System.out.print(" Pilihan menu anda : ");
            int pil = input.nextInt();
        switch (pil) {
            case 1:
                menu[i] = "Seblak";
                harga[i] = 15000;
                break;
            case 2:
                menu[i] = "Bakso";
                harga[i] = 25000;
                break;
            case 3:
                menu[i] = "Mie Goreng";
                harga[i] = 10000;
                break;
                default:
            System.out.println(" Maaf Pilihan Menu Yg anda pilih tidaktersedia!!!");
            menu[i] = " Tidak Ada ";
            break;
        }
        System.out.println(" Menu yg anda pesan adalah : " + menu[i]);
        System.out.println(" Harga yg harus anda bayar : " + harga[i]);
        System.out.print(" Apakah anda ingin memesan lagi ? (y/t) : ");
        try{
            keputusan = input2.readLine();
        }catch(IOException e){
            System.out.println(" Gagal membaca Keyboard");
        }
        i++;
        }
        System.out.println("");
        System.out.println(" Menu yg anda pesan adalah : " +i);
        for (int a = 0; a < i; a++) {
            System.out.println(menu[a]+",");
        }
        System.out.println("");
        for (int b = 0; b < i; b++) {
            hargaTotal = hargaTotal + harga[b];
        }
        System.out.println(" Total yg harus anda bayar adalah : Rp. " +hargaTotal);
    }
}
