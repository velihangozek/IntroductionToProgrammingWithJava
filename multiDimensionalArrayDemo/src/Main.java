public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[2][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Edirne";
        sehirler[0][2] = "Kırklareli";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Karaman";
        System.out.println(sehirler.length);
        System.out.println(sehirler[0].length);

        for (int i = 0; i < sehirler.length; i++) {
            System.out.println("--------------------");
            for (int j = 0; j < sehirler[0].length; j++)
            {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
