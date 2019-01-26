package ui;

import model.CourseList;
import model.Picture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseNotes {
    private Scanner scanner = new Scanner(System.in);

    public CourseNotes() {
        while (true) {
            CourseList cList1 = new CourseList();

            System.out.println("What would you like to do?:");
            System.out.println("1) Make a new course directory: (a)");
            System.out.println("2) Search existing course directories: (b)");
            System.out.println("3) Quit: (c)");
            String answer = scanner.nextLine();

            if (answer.equals("a")) {
                System.out.println("What would you like to name this course?");
                String courseName = scanner.nextLine();

                // First, create a new list of Courses, then create a course to put inside that list
                List<Picture> pList = new ArrayList<>();
                Course course1 = new Course(courseName, "red", pList);

                // Place the newly instantiated Course within the CourseList
                cList1.addToCourseList(course1);

                // Add any pictures to the course notes
                course1.addPictures();
            }
            if (answer.equals("b")) {
                cList1.searchCourseList();

                System.out.println("The existing courses are:" + cList1.printNames());
                System.out.println("What would you like to do?:");
                System.out.println("1) Retrieve a course: (a)");
                System.out.println("2) Quit: (b)");
                String answer2 = scanner.nextLine();

                if (answer2.equals("a")) {
                }
                else break;
            }
            else break;
        }
    }
}
