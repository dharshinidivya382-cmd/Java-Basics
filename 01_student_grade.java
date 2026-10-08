import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in 5 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 90)
            System.out.println("Grade: A+");
        else if (average >= 80)
            System.out.println("Grade: A");
        else if (average >= 70)
            System.out.println("Grade: B");
        else if (average >= 60)
            System.out.println("Grade: C");
        else if (average >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");

        sc.close();
    }
}
