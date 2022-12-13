package TeoriPBO.YudiGunawan;

public class polimorfisme {
    public static void main(String[] args) {
        bentuk2D b2d;

        persegiPanjang pp = new persegiPanjang(4, 5);
        b2d = pp;
        System.out.println("Luas dan Keliling PersegiPanjang");
        b2d.display();

        segitiga s3 = new segitiga(6, 8);
        b2d = s3;
        b2d.display();

        b2d = new BujurSangkar(10.0,10.0);
        b2d.display();
    }
}
