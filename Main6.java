class Produk2 {
    String judul;
    String penulis;

    Produk2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    String getInfoProduk() {
        return "Judul: " + judul + ", Penulis: " + penulis;
    }
}

class Komik2 extends Produk2 {
    int jumlahHalaman;

    Komik2(int jumlahHalaman, String judul, String penulis) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    String getInfoProduk() {
        return super.getInfoProduk() + ", Jumlah Halaman: " + jumlahHalaman;
    }
}

class Games2 extends Produk2 {
    int waktuMain;

    Games2(int waktuMain, String judul, String penulis) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    String getInfoProduk() {
        return super.getInfoProduk() + ", Waktu Main: " + waktuMain + " jam";
    }
}

public class Main6 {
    public static void main(String[] args) {
        Komik2 komik = new Komik2(200, "One Piece", "Eichiro Oda");
        Games2 game = new Games2(50, "Minecraft", "Mojang");

        System.out.println(komik.getInfoProduk());
        System.out.println(game.getInfoProduk());
    }
}