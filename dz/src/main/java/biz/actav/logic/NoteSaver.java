package biz.actav.logic;

import biz.actav.utils.TimeUtils;
import java.io.FileWriter;
import java.io.IOException;

public class NoteSaver {
    private static final String FILE_NAME = "notes.txt";

    public void save(String note) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(TimeUtils.getCurrentTime() + " -> " + note + "\n");
            System.out.println("Дозапись в файл: " + TimeUtils.getCurrentTime() + " -> " + note);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}

