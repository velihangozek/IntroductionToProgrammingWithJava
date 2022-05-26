//public class Main {
//
//    public static void main(String[] args) {
//        int sayi = 27;
//        int sayi2 = 27;
//        int sayi3 = 27;
//
//        if (sayi < sayi2) {
//            if (sayi2 < sayi3) {
//                System.out.println(sayi3 + " En büyüktür");
//            } else if (sayi2 > sayi3) {
//                System.out.println(sayi2 + " En büyüktür");
//            }
//        } else if (sayi2 > sayi3) {
//            System.out.println(sayi + " En büyüktür");
//        } else if (sayi3 > sayi) {
//            System.out.println(sayi3 + " En büyüktür");
//        } else {
//            System.out.println(sayi + " En büyüktür");
//        }
//    }
//}

// ALTERNATIVE SOLUTION

public class Main
{
    public static void main(String[] args)
    {
        int sayi1 = 31;
        int sayi2 = 31;
        int sayi3 = 31;
        int enBuyuk = sayi1;

        if(enBuyuk < sayi2)
        {
            enBuyuk = sayi2;
        } if (enBuyuk < sayi3)
        {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı: " + enBuyuk);
    }
}
