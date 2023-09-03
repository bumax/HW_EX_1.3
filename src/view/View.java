package view;

import java.util.Scanner;

public class View {
    public View() {
        scan = new Scanner(System.in);
    }

    private Scanner scan;

    public String getStrValue(String msg) {
        System.out.println("Введите " + msg + " (строка):");
        String line = new String();
        while (line.isEmpty())
            line = scan.nextLine();
        return line;
    }
}
