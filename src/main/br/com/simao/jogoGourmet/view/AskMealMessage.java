package br.com.simao.jogoGourmet.view;

import javax.swing.*;

/**
 * @author: simão
 */
public class AskMealMessage {

    private static final String ASK_MESSAGE = "O prato que você pensou é %s?";
    private static final String CONFIRM_MESSAGE = "Responda";

    public Boolean ask(String message) {
        message = String.format(ASK_MESSAGE, message);
        int response = JOptionPane.showConfirmDialog(null, message,CONFIRM_MESSAGE,JOptionPane.YES_NO_OPTION);
        return response == 0;
    }

}
