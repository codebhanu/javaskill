import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter the second string: ");
            String str2 = scanner.nextLine();

            if (str1.length() == 0 || str2.length() == 0) {
                throw new IllegalArgumentException("String should not be null.");
            }

            int length1 = str1.length();
            System.out.println("Length of the first string: " + length1);

            String concatenatedString = str1.concat(str2);
            System.out.println("Concatenated string: " + concatenatedString);

            String reverse = "";
            for (int x = str1.length() - 1; x >= 0; x--) {
                reverse += str1.charAt(x);
            }

            System.out.println(" First reversed string: " + reverse);
            String revrse1= ""; 
            for (int y=str2.length()-1; y>=0; y--){
                revrse1+=str2.charAt(y);
            }
            System.out.println(" Second reversed string: " + revrse1);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
