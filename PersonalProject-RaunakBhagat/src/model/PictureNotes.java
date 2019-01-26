package model;

import java.util.Scanner;

public class PictureNotes {
    String notes = "";
    Scanner scanner = new Scanner(System.in);

    public void addNotesToPicture() {
        System.out.println("Type in notes below:");
        String notesTyped = scanner.nextLine();
        notes = notesTyped;
    }
}