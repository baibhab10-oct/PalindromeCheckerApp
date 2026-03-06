import java.util.Scanner;
public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input != null && !input.isEmpty()) {
            char[] charArray = input.toLowerCase().toCharArray();
            boolean isPalindrome = true;
            int start = 0;
            int end = charArray.length - 1;

            while (start < end) {
                if (charArray[start] != charArray[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }
            System.out.println(isPalindrome);
        }
        scanner.close();
    }
}