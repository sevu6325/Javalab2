
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String topper = "";
        int highestTotal = 0;

        for (int student = 1; student <= 5; student++) {

            System.out.println("\nEnter details of Student " + student);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Subject 1: ");
            int sub1 = sc.nextInt();

            System.out.print("Subject 2: ");
            int sub2 = sc.nextInt();

            System.out.print("Subject 3: ");
            int sub3 = sc.nextInt();

            System.out.print("Subject 4: ");
            int sub4 = sc.nextInt();

            System.out.print("Subject 5: ");
            int sub5 = sc.nextInt();

            int total = sub1 + sub2 + sub3 + sub4 + sub5;
            double average = total / 5.0;

            System.out.println("Total = " + total);
            System.out.println("Average = " + average);

            // Find topper
            if (total > highestTotal) {
                highestTotal = total;
                topper = name;
            }
        }

        System.out.println("\n----- CLASS TOPPER -----");
        System.out.println("Topper = " + topper);
        System.out.println("Highest Total = " + highestTotal);

        sc.close();
    }
}