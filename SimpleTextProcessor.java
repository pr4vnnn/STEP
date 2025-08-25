import java.util.Scanner;

public class SimpleTextProcessor {

    public static String[] addLine(String[] lines, String newLine) {
        String[] newArr = new String[lines.length + 1];
        for (int i = 0; i < lines.length; i++) newArr[i] = lines[i];
        newArr[lines.length] = newLine;
        return newArr;
    }

    public static String[] removeLine(String[] lines, int index) {
        if (index < 0 || index >= lines.length) return lines;
        String[] newArr = new String[lines.length - 1];
        for (int i = 0, j = 0; i < lines.length; i++) {
            if (i != index) newArr[j++] = lines[i];
        }
        return newArr;
    }

    public static void displayLines(String[] lines) {
        System.out.println("\nCurrent Text:");
        for (int i = 0; i < lines.length; i++) {
            System.out.println((i + 1) + ": " + lines[i]);
        }
        if (lines.length == 0) System.out.println("[No text entered]");
    }

    public static void searchKeyword(String[] lines, String keyword) {
        System.out.println("\nSearch results for \"" + keyword + "\":");
        boolean found = false;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println((i + 1) + ": " + lines[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No lines found containing the keyword.");
    }

    public static String toTitleCase(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.length() > 0) sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = {};
        while (true) {
            System.out.println("\n1. Add line");
            System.out.println("2. Remove line");
            System.out.println("3. Display all lines");
            System.out.println("4. Search keyword");
            System.out.println("5. Convert line to Title Case");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter line to add: ");
                String line = sc.nextLine();
                lines = addLine(lines, line);
            } else if (choice == 2) {
                System.out.print("Enter line number to remove: ");
                int num = sc.nextInt();
                sc.nextLine();
                lines = removeLine(lines, num - 1);
            } else if (choice == 3) {
                displayLines(lines);
            } else if (choice == 4) {
                System.out.print("Enter keyword to search: ");
                String keyword = sc.nextLine();
                searchKeyword(lines, keyword);
            } else if (choice == 5) {
                System.out.print("Enter line number to convert: ");
                int num = sc.nextInt();
                sc.nextLine();
                if (num > 0 && num <= lines.length) {
                    lines[num - 1] = toTitleCase(lines[num - 1]);
                    System.out.println("Line converted to Title Case.");
                } else {
                    System.out.println("Invalid line number.");
                }
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}
