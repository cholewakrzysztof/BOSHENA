package student;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.printf("Hello and welcome in BOSHENA v1.0!");

        View view = new View();

        while (true) {
            view.ExecuteUseCases();
        }
    }
}