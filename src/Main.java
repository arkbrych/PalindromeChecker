import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz ciąg znaków");
        String word = input.nextLine();

        if (IsPalindrome(word) == true){
            System.out.println("Ciąg znaków jest palindromem");
        } else {
            System.out.println("Ciąg znaków nie jest palindromem");
        }

    }

    static boolean IsPalindrome(String word) {


        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            rev = rev + word.charAt(i);

        }

        return word.equals(rev);
    }
}
