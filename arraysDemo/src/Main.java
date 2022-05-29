public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Büşra";
        String ogrenci2 = "Velihan";
        String ogrenci3 = "Çağla";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("Brute Force approach is done!");
        // ALTERNATIVE

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Furkan";
        ogrenciler[1] = "Velihan";
        ogrenciler[2] = "Çağla";
        // ogrenciler[3] = "Büşra"; index 3 out of bounds for length 3 --> length should be 4.
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("For loop ended!");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
        System.out.println("ogrenciler array traverse is done via foreach!");
    }
}
