class Hewan2 {
    String nama;

    Hewan2(String nama) {
        this.nama = nama;
    }

    void makan() {
        System.out.println(nama + " sedang makan...");
    }
}

class Kucing extends Hewan2 {
    Kucing(String nama) {
        super(nama);
    }

    String display() {
        return "Nama hewan ini adalah " + nama;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Kucing k = new Kucing("Milo");
        k.makan();
        System.out.println(k.display());
    }
}