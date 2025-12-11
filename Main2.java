class Segitiga {
    protected double alas;
    protected double tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(10, 6);
        System.out.println("Luas segitiga = " + s.hitungLuas());
    }
}