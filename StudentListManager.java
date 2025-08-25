import java.util.Scanner;

public class StudentListManager {

    public static String[] addStudent(String[] students, String newStudent) {
        String[] newArr = new String[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newArr[i] = students[i];
        }
        newArr[students.length] = newStudent;
        return newArr;
    }

    public static String[] removeStudent(String[] students, String studentToRemove) {
        int count = 0;
        for (String s : students) {
            if (s.equalsIgnoreCase(studentToRemove)) count++;
        }
        if (count == 0) return students;

        String[] newArr = new String[students.length - count];
        int index = 0;
        for (String s : students) {
            if (!s.equalsIgnoreCase(studentToRemove)) {
                newArr[index++] = s;
            }
        }
        return newArr;
    }

    public static void displayStudents(String[] students) {
        System.out.println("Student List:");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
        if (students.length == 0) {
            System.out.println("No students found.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {};
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter student name to add: ");
                String name = scanner.nextLine();
                students = addStudent(students, name);
            } else if (choice == 2) {
                System.out.print("Enter student name to remove: ");
                String name = scanner.nextLine();
                students = removeStudent(students, name);
            } else if (choice == 3) {
                displayStudents(students);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
