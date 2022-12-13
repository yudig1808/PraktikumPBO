package Quis1_SI05B_3051;

public class Dosen_3051 extends Penduduk_3051 {
    private String nidn_3051, gaji_3051;
    private int gajiPokok_3051;
    
    public double totalPendapatan(){
        System.out.println(" GolonganIIIA "  + gajiPokok_3051 + "300.000");
        System.out.println(" GolonganIIIB "  + gajiPokok_3051 + "500.000");
        System.out.println(" GolonganIIIC " + gajiPokok_3051 + "700.000");
    }
    
    public void tampilDataDosen(){
        System.out.println(" NIDN : " + nidn_3051);
        System.out.println(" Gaji : " + gaji_3051);
        System.out.println(" Gaji Pokok : " + gajiPokok_3051);
    }
}
