import java.util.Scanner;

public class StringInputProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Original string: " + input);
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());

        System.out.print("Enter a substring to search: ");
        String substring = scanner.nextLine();
        System.out.println("Index of substring: " + input.indexOf(substring));

        System.out.print("Enter a character to count: ");
        char ch = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) count++;
        }
        System.out.println("Count of '" + ch + "': " + count);

        System.out.println("Reversed string: " + new StringBuilder(input).reverse().toString());

        System.out.print("Enter a string to replace in original: ");
        String oldStr = scanner.nextLine();
        System.out.print("Enter replacement string: ");
        String newStr = scanner.nextLine();
        System.out.println("After replacement: " + input.replace(oldStr, newStr));

        scanner.close();
    }
}
