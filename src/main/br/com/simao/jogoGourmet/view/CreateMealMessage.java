package main.br.com.simao.jogoGourmet.view;

import javax.swing.*;

public class CreateMealMessage {

    private static final String DIFFERENCE_MESSAGE = "%s é _______ mas %s não.";
    private static final String NEW_MEAL_MESSAGE = "Qual o prato que você pensou?";

    public static String askForMeal() {
        return JOptionPane.showInputDialog(NEW_MEAL_MESSAGE);
    }

    public static String askForDifference(String newMeal, String wrongMeal) {
        String message = String.format(DIFFERENCE_MESSAGE, newMeal, wrongMeal);
        return JOptionPane.showInputDialog(message);
    }
}
