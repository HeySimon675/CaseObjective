package br.com.simao.jogoGourmet.view;

import javax.swing.*;

public class WinMessage {

    private static final String MESSAGE = "Acertei de novo!";

    public WinMessage() {
        JOptionPane.showMessageDialog(null, MESSAGE);
    }
}
