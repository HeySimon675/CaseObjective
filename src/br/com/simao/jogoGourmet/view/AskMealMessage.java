package br.com.simao.jogoGourmet.view;

import javax.swing.*;

public class AskMealMessage {

    private static final String ASK_MESSAGE = "O prato que você pensou é %s?";

    public static Boolean ask(String message) {
        message = String.format(ASK_MESSAGE, message);
        int response = JOptionPane.showConfirmDialog(null, message);
        return response == 0;
    }

}
