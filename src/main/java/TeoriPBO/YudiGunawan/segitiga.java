package TeoriPBO.YudiGunawan;

public class segitiga extends bentuk2D {
    private double alas;
    private double tinggi;

    public segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return alas * 3;
    }

    public void display() {
        System.out.println("Luas dan Keliling Segitiga");
        super.display();
    }
}
