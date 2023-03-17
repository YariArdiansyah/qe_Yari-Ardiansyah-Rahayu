package Yari;

public class BasicProgramming{
    public static void main(String[] args) {

        int n = 5;
        printAsterisk(n);
        drawXYZ(5);

            // SOAL PRIORITAS 1

        // segitiga
        float alas = 20;
        float tinggi = 25;
        double luasSegitiga = 0.5 * (alas*tinggi);
        System.out.println("Luas Segitiga : " + luasSegitiga);

//        // TODO: hitung luas segitiga
//
//        // persegi panjang
        float panjang = 40;
        float lebar = 6;
        double luasPersegiPanjang = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);

//        //TODO: hitung luas persegi panjang
//
//        // lingkaran
        double jari2 = 7;
        double luasLingkaran = 3.14 * (jari2*jari2);
        System.out.println("Luas Persegi Panjang : " + luasLingkaran);

//        //TODO: hitung luas lingkaran
//
//        // Mengecek hasil penjualan
        int hargaBeli = 12000;
        int hargaJual = 9000;

        if (hargaBeli < hargaJual) {
            System.out.println("Untung! Dengan Keuntungan " + (hargaJual - hargaBeli));
        } else if (hargaBeli > hargaJual) {
            System.out.println("Rugi :( Dengan Kerugian " + (hargaJual - hargaBeli));
        } else {
            System.out.println("Sama saja.");
        }
    }
            // SOAL PRIORITAS 2
        public static void drawXYZ(int n) {
            //TODO: complete this code
            for (int i = 1; i <= n*n; i++){
                if (i%3 == 0) {
                    System.out.print("X");
                } else if (i%2 == 1) {
                    System.out.print("Y");
                } else {
                    System.out.print("Z");
                }
                if (i%n == 0){
                    System.out.println();
                }
            }
    }

    public static void printAsterisk(int n) {
        for (int i=0; i<n; i++) {
            for (int j=n-i; j>1; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}