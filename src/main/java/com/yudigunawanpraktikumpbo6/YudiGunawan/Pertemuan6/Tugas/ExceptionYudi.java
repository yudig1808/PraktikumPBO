package com.yudigunawanpraktikumpbo6.YudiGunawan.Pertemuan6.Tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionYudi {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        
        String nama;
        String alamat;
        String beratBadan;
        int jmlKendaraan[] = new int[10];
        
        try{
            // Input Menggunakan BufferedReader
            System.out.println("========= Form Data Diri =========");
            System.out.print(" Masukkan Nama Anda : ");
            nama = input2.readLine();
            System.out.print(" Masukkan Alamat Anda : ");
            alamat = input2.readLine();
            System.out.print(" Masukkan Berat Badan Anda : ");
            beratBadan = input2.readLine();
            int bb = Integer.parseInt(beratBadan);
            
            // Input Menggunakan Scanner
            System.out.print(" Masukkan Hobby Anda  : ");
            String hobby = null;
            hobby = hobby = input1.nextLine(); 
            if(hobby==null){
                throw new NullPointerException();
            }else{
               System.out.print(hobby);
            }
            System.out.print(" Masukkan Jumlah Kendaraan Anda : ");
            jmlKendaraan[5] = input1.nextInt();
            System.out.print(" Masukkan Umur Anda : ");
            int umur = input1.nextInt();
            System.out.print(" Masukkan Pendapatan Anda : ");
            int pendapatan = input1.nextInt();
            System.out.print(" Masukkan Berapa Bulan Anda Mengeluarkan Uang : ");
            int pengeluaran = input1.nextInt();
            
            int Perbulan = pendapatan / pengeluaran;
         
            System.out.println(" Nama Anda : " + nama);
            System.out.println(" Alamat Anda : " + alamat);
            System.out.println(" Umur Anda : " + umur + " Tahun ");
            System.out.println(" Berat Badan Anda : " + beratBadan + " KG ");
            System.out.println(" Hobby Anda : " + hobby);
            System.out.println(" Jumlah Kendaraan Anda : " + jmlKendaraan[5]);
            System.out.println(" Pengeluaran Perbulan Anda : " + Perbulan + " Setiap Bulan ");
            
        }catch(IOException e){
            System.out.println(" Terjadi kesalahan pada program!");
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println(" Tidak Bisa Membagi Pengeluaran Anda Perbulan! ");
        }catch(NumberFormatException e){
            System.out.println(" Invalid : " + "Tolong masukkan sesuai dengan Format!");
        }catch(InputMismatchException e){
            System.out.println(" Harap masukkan Angka saja! ");
        }catch(NullPointerException e){
            System.out.println(" Hobby tidak boleh kosong! ");
        }catch(RuntimeException e){
            System.out.println(" Terjadi kesalahan!");
        }catch(Exception e){
            System.out.println("");
        }
    }
}