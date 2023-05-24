import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int palindromeCount = 0;
        int notPalindromeCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("String is Palindrome");
                palindromeCount++;
            } else {
                System.out.println("String is Not Palindrome");
                notPalindromeCount++;
            }
        }

        System.out.println("string was Palindrome "+palindromeCount+" times");
        System.out.println("string was  not Palindrome " + notPalindromeCount+(" times"));
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
