package model;

import java.util.Scanner;

public class Picture {
    private Scanner scanner = new Scanner(System.in);


    public void addNotes() {
        System.out.println("Would you like to add any notes to this picture? Answer: (Yes) or (No)");
        String addNotes = scanner.nextLine();
        if (addNotes.equals("Yes")) {
            PictureNotes pNotes = new PictureNotes();
            pNotes.addNotesToPicture();
        }
    }
}