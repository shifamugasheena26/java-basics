package String;
import java.util.Scanner;


public class sequential{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        int n = ch.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {

            while (left < right && !isVowel(ch[left])) {
                left++;
            }

            while (left < right && !isVowel(ch[right])) {
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        System.out.println("Output: " + new String(ch));
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}