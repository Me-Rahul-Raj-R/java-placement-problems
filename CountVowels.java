
import java.util.*;
public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner class
        System.out.print("Enter a string: ");// print statement
        String input = scanner.nextLine();//input
        int vowelCount = countVowels(input);//method call
        System.out.println("Number of vowels: " + vowelCount);//print
        scanner.close();
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}