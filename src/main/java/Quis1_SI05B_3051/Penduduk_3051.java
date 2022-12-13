package Quis1_SI05B_3051;

public class Penduduk_3051 {
    String nik_3051, nama_3051, alamat_3051;
    int umur_3051;
    
    public Penduduk_3051(){}
    
            
    public Penduduk_3051(String nik_3051,String nama_3051, String alamat_3051, int umur_3051 ){ 
        this.nik_3051 = nk;
        this.nama_3051 = nm; 
        this.alamat_3051 = at;
        this.umur_3051 = ur;
    }     
                  
    public void tampilDataPenduduk(){
        System.out.println(" Nama : " + nik_3051);
        System.out.println(" Nik : " + nama_3051);
        System.out.println(" Alamat : " + alamat_3051);
        System.out.println(" Umur : " + umur_3051);
    }
    

    public String getNik_3051() {
        return nik_3051;
    }

    public void setNik_3051(String nik_3051) {
        this.nik_3051 = nik_3051;
    }

    public String getNama_3051() {
        return nama_3051;
    }

    public void setNama_3051(String nama_3051) {
        this.nama_3051 = nama_3051;
    }

    public String getAlamat_3051() {
        return alamat_3051;
    }

    public void setAlamat_3051(String alamat_3051) {
        this.alamat_3051 = alamat_3051;
    }

    public int getUmur_3051() {
        return umur_3051;
    }

    public void setUmur_3051(int umur_3051) {
        this.umur_3051 = umur_3051;
    }
}