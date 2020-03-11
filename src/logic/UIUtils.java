package logic;

import java.io.IOException;
import java.util.Scanner;

public class UIUtils {
    public static String inputData (String message) {
        System.out.print(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static double inputNumber (String message){
        double result = 0;

        boolean isDigit = false;

        do {
            try {
                result = Double.parseDouble(inputData(message));

                isDigit = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please re enter again");
            }
        } while (!isDigit);

        return result;
    }
}
