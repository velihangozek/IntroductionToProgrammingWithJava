import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String letter = "F";
        String[] frontVowels = {"E", "İ", "Ö", "Ü"};
        String[] backVowels = {"A", "I", "O", "U"};
        letter.toUpperCase();
        for (String forLetter : frontVowels) {
            if (forLetter.equals(letter)) {
                System.out.println(letter + " is a Front Vowel!");
                return;
            }
        }
        for (String forLetter : backVowels) {
            if (forLetter.equals(letter)) {
                System.out.println(letter + " is a Back Vowel!");
                return;
            }
        }
        System.out.println(letter + " is a Consonant!");

    }
}