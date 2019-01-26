package ui;

import model.Picture;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Course {

   // Fields:
    private String name;
    private String colour;
    private List<Picture> pictures = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Constructor:
    public Course(String name, String colour, List<Picture> pList) {
        this.name = name;
        this.colour = colour;
        pictures = pList;
        System.out.println("New course, " + name + ", has been created.");
    }

    // Getters:
    public String getName() {
        return name;}
    public String getColour() {
        return colour;}

    // Setters/Adders:
    public void setName(String name) {
        this.name = name;}
    public void setColour(String colour) {
        this.colour = colour;}
    public void addPictures() {
        while (true) {
            System.out.println("Would you like to add a picture? Answer: (Yes) or (No)");
            String addPicture = scanner.nextLine();
            if (addPicture.equals("Yes")) {
                Picture picture1 = new Picture();
                pictures.add(picture1);
                picture1.addNotes();
            } if (addPicture.equals("No")) {
                break;
            }
        }
    }
}