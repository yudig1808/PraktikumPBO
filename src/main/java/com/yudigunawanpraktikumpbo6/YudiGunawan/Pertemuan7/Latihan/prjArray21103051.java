package com.yudigunawanpraktikumpbo6.YudiGunawan.Pertemuan7.Latihan;

import java.util.Scanner;

public class prjArray21103051 {
    public static void main(String[] args) {
        int n, jml = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Elemen Array : ");
        n = input.nextInt();
        int bil[] = new int[3];
        System.out.print("Masukkan Elemen Array :");
        for (int i = 0; i < 3; i++) {
            bil[i] = input.nextInt();
            jml = jml + bil[i];
        }
        System.out.println("Jumlah :" + jml);
    }
}