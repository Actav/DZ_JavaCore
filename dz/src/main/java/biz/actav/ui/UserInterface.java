package biz.actav.ui;

import biz.actav.logic.NoteSaver;
import java.util.Scanner;

public class UserInterface {
    private final NoteSaver noteSaver;

    public UserInterface() {
        this.noteSaver = new NoteSaver();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        String note = scanner.nextLine();
        noteSaver.save(note);
    }
}
