package TeoriPBO.YudiGunawan;

public class persegiPanjang extends bentuk2D {
    protected double panjang;
    protected double lebar;

    public persegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public void display() {
        super.display();
        
    }
}
