package model;

import ui.Course;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseList {
    private Scanner scanner = new Scanner(System.in);
    private List<Course> courseList = new ArrayList<>();

    public void addToCourseList(Course course) {
        courseList.add(course);
    }

    public String printNames() {
        String listOfNames = "";
        for (Course course : courseList) {
            listOfNames = listOfNames + "(" + course.getName() + ")";
        }
        return listOfNames;
    }

    public String printCoursesInOrder() {
        String listOfNames = "";
        int i = 1;
        for (Course course : courseList) {
            listOfNames = listOfNames + i + ")" + "(" + course.getName() + ")";
            i = i++;
        }
        return listOfNames;
    }

    public void searchCourseList() {
        System.out.println("The existing courses are: " + printNames());
        System.out.println("What would you like to do?:");
        System.out.println("1) Retrieve a course: (a)");
        System.out.println("2) Quit: (b)");
        String answer = scanner.nextLine();

        while (true) {
            if (answer.equals("a")) {
                System.out.println("Which course would you like to retrieve? Please select the corresponding number:");
                System.out.println(printCoursesInOrder());
                int coursePosition = scanner.nextInt();
                if (0 < coursePosition && coursePosition < (courseList.size() - 1)) {
                    Course pickedCourse = getCourse(coursePosition);
                }
                else System.out.println("That was not a valid course number.");
            }
            else break;
        }
    }



    // Getters:
    // REQUIRES: coursePosition is a valid index number in courseList
    // MODIFIES:
    // EFFECTS:
    public Course getCourse(int coursePosition) {
        return courseList.get(coursePosition);
    }
}
