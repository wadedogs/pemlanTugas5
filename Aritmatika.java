public class Aritmatika {
    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
        // hitungPenjumlahan(a,b); (Soal no.5)
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    // SOAL NO 6
    public double hitungPembagian(String nil, String nil2) {
        double nilai = Double.parseDouble(nil);
        double nilai2 = Double.parseDouble(nil2);
        double hasil = nilai / nilai2;
        return hasil;
    }
}
