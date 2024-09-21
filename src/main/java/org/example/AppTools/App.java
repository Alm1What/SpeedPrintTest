package org.example.AppTools;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    private int incorrectTextCount = 0;

    public void startApp() {
        System.out.println("Enter text for start");

        Text text = new Text();
        text.printText();

        Scanner scanner = new Scanner(System.in);


        System.out.println("\n");

        for (int i = 0; i < text.getAppText().length; i++) {
            System.out.print("Введіть слово для перевірки: ");
            String userInput = scanner.nextLine();

            if (text.getAppText()[i].equalsIgnoreCase(userInput)) {
                System.out.println("Слово правильно!");
            } else {
                System.out.println("Слово неправильно! Правильний варіант: " + text.getAppText()[i]);
                incorrectTextCount++;
            }
            System.out.println();
        }

        scanner.close();
        System.out.println("Перевірка завершена.");
    }

    /*
    TODO:
    you need to implement the text that the user can provide himself the problem of the console is not visible text
     */


}
