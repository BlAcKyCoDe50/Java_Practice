import java.util.Scanner;

public class StudentManagementSystem {
  static Scanner sc = new Scanner(System.in);
  static int numOfStudents;
  static String[] names;
  static int[] grades;

  public static void main(String[] args) {
    getNumberOfStudents();
    getStudentDetails();
    printStudentDetails();
    getAverageGrade();
    getStudentWithHighestGrade();
    sc.close();
  }

  public static void getNumberOfStudents() {
    System.out.println("Enter the number of students: ");
    numOfStudents = sc.nextInt();
    names = new String[numOfStudents];
    grades = new int[numOfStudents];
  }

  public static void getStudentDetails() {
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("Enter the name of student " + (i + 1) + ": ");
      names[i] = sc.next();
      System.out.println("Enter the grade of student " + (i + 1) + ": ");
      grades[i] = sc.nextInt();
    }
  }

  public static void printStudentDetails() {
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("Student " + (i + 1) + ": " + names[i] + " with grade " + grades[i]);
    }
  }

  public static void getAverageGrade() {
    int total = 0;
    for (int grade : grades) {
      total += grade;
    }
    double average = (double) total / numOfStudents;
    System.out.println("The average grade is: " + average);
  }

  public static void getStudentWithHighestGrade() {
    int maxIndex = 0;
    for (int i = 1; i < numOfStudents; i++) {
      if (grades[i] > grades[maxIndex]) {
        maxIndex = i;
      }
    }
    System.out.println("The student with the highest grade is " + names[maxIndex] + " with a grade of " + grades[maxIndex]);
  }
}