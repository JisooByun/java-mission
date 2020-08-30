package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        CalCulator calCulator = new CalCulator(str);

        System.out.println(calCulator.calculate());
    }

}
