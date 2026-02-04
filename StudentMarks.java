import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = 3;
        int subjects = 3;

        int[][] marks = new int[students][subjects];

        int choice;

        do {
            System.out.println("\n--- Student Marks Management ---");
            System.out.println("1. Add student marks");
            System.out.println("2. Update student marks");
            System.out.println("3. Calculate student average");
            System.out.println("4. Calculate subject average");
            System.out.println("5. Calculate total marks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add marks
                    for (int i = 0; i < students; i++) {
                        System.out.println("Enter marks for Student " + (i + 1));
                        for (int j = 0; j < subjects; j++) {
                            System.out.print("Subject " + (j + 1) + ": ");
                            marks[i][j] = sc.nextInt();
                        }
                    }
                    break;

                case 2:
                    // Update marks
                    System.out.print("Enter student number (1-3): ");
                    int s = sc.nextInt() - 1;

                    System.out.print("Enter subject number (1-3): ");
                    int sub = sc.nextInt() - 1;

                    System.out.print("Enter new mark: ");
                    marks[s][sub] = sc.nextInt();
                    System.out.println("Marks updated successfully.");
                    break;

                case 3:
                    // Student average
                    System.out.print("Enter student number (1-3): ");
                    s = sc.nextInt() - 1;

                    int sum = 0;
                    for (int j = 0; j < subjects; j++) {
                        sum += marks[s][j];
                    }

                    System.out.println("Student Average: " + (sum / subjects));
                    break;

                case 4:
                    // Subject average
                    System.out.print("Enter subject number (1-3): ");
                    sub = sc.nextInt() - 1;

                    sum = 0;
                    for (int i = 0; i < students; i++) {
                        sum += marks[i][sub];
                    }

                    System.out.println("Subject Average: " + (sum / students));
                    break;

                case 5:
                    // Total marks
                    int total = 0;
                    for (int i = 0; i < students; i++) {
                        for (int j = 0; j < subjects; j++) {
                            total += marks[i][j];
                        }
                    }
                    System.out.println("Total Marks: " + total);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}