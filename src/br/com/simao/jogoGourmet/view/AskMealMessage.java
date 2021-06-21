package br.com.simao.jogoGourmet.view;

import javax.swing.*;

public class AskMealMessage {

    public static Boolean ask(String message) {
        int response = JOptionPane.showConfirmDialog(null, message);
        return response == 0;
    }

}
