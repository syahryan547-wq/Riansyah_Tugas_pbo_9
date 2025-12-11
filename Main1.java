class Hewan {
    String jenis;

    Hewan(String jenis) {
        this.jenis = jenis;
    }

    void tampil() {
        System.out.println("- hewan berkaki " + jenis);
    }
}

class BerkakiDua extends Hewan {
    BerkakiDua() { super("dua"); }
}

class BerkakiEnam extends Hewan {
    BerkakiEnam() { super("enam"); }
}

class BerkakiEmpat extends Hewan {
    BerkakiEmpat() { super("empat"); }
}

class BerkakiDelapan extends Hewan {
    BerkakiDelapan() { super("delapan"); }
}

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Macam-macam hewan:");
        new BerkakiDua().tampil();
        new BerkakiEnam().tampil();
        new BerkakiEmpat().tampil();
        new BerkakiDelapan().tampil();

        System.out.println("\nContoh hewan:");
        System.out.println("- hewan berkaki dua: kangguru, ayam, bebek, dll");
        System.out.println("- hewan berkaki enam: capung, nyamuk, kupu-kupu, dll");
        System.out.println("- hewan berkaki empat: kucing, anjing, kuda, dll");
        System.out.println("- hewan berkaki delapan: kepiting, belalang, laba-laba, dll");
    }
}
