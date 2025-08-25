public class StringManipulation {
    public static void main(String[] args) {

        String str1 = "Hello World";

        String str2 = new String("Hello World");

        char[] charArray = {'J', 'a', 'v', 'a'};

        String str3 = new String(charArray);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        System.out.println("Length of str1: " + str1.length());
        System.out.println("Uppercase str1: " + str1.toUpperCase());
        System.out.println("Lowercase str1: " + str1.toLowerCase());
        System.out.println("Substring of str1 (6 to 11): " + str1.substring(6, 11));
        System.out.println("Does str1 start with 'Hello'? " + str1.startsWith("Hello"));
        System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        String trimmed = " Trim me ".trim();
        System.out.println("Trimmed string: '" + trimmed + "'");

        String concatenated = str1 + " & " + str3;
        System.out.println("Concatenated string: " + concatenated);
    }
}
