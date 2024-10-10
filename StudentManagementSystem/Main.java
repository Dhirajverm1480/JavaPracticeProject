// Student management System : 
// Mainge Student Records, including adding, deleting, displaying student details.
// Concept:- I/o Expeptions, OOPS, collections

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void TitleDisplay(String title) {
        System.out.print("| ----------------------------------------------- |");
        System.out.print(" " + title + " ");
        System.out.println("| ----------------------------------------------- |");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        TitleDisplay("Student Management System");
        // scanner.next();

        while (true) {
            // 1. add Student 2. delete student, 3. displaying student detail 4. update

            System.out.println("1. add Student\t 2.delete Student\t 3.displaying student detail");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    TitleDisplay("Add Student");

                    try {
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        int classNumber = scanner.nextInt();

                        studentList.add(new Student(id, name, classNumber));
                    } catch (Exception e) {
                        System.out.println("Error reading input: " + e.getMessage());
                    } 
                    System.out.println("Add Student");
                    break;

                case 2:
                    TitleDisplay("Delete Student");
                    System.out.print("Enter the index -> ");
                    int listItemDelete = scanner.nextInt();
                    studentList.remove(listItemDelete);
                    System.out.println("Student is deleted");
                    break;

                case 3:
                    System.out.println("Displaying student detail");
                    TitleDisplay("Display student Detail");
                    for (Student student : studentList) {
                        System.out.println(
                                student.getId() + " " + student.getStudentName() + " " + student.getClassNumber());
                    }
                    break;

                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}