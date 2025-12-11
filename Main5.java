class Produk {
    String judul;
    String penulis;

    Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    String getInfoProduk() {
        return "Judul: " + judul + ", Penulis: " + penulis;
    }
}

class Komik extends Produk {
    Komik(String judul, String penulis) {
        super(judul, penulis);
    }
}

class Games extends Produk {
    Games(String judul, String penulis) {
        super(judul, penulis);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Komik komik = new Komik("Naruto", "Masashi Kishimoto");
        Games game = new Games("GTA V", "Rockstar");

        System.out.println(komik.getInfoProduk());
        System.out.println(game.getInfoProduk());
    }
}