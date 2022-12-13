package Unggas;

public class Unggas {
    // Attribute (Variable)
    String nama,warnaBulu;
    int usia,ukuran;
    
    // Method (Fungsi)
    public void bernafas(String nafas){
        System.out.println("" +nama +" Bernafas Menggunakan " + nafas);
    }
    
    public void showInfo(){
        System.out.println(" Nama " + nama);
        System.out.println(" Warna Bulu " + warnaBulu);
        System.out.println(" Usia " + usia + "Tahun");
        System.out.println(" Ukuran " + ukuran + "cm");
        extraInfo();
    }
    
    public void extraInfo(){}
}
