package main.br.com.simao.jogoGourmet;

import main.br.com.simao.jogoGourmet.model.MealFinder;
import main.br.com.simao.jogoGourmet.view.StartButtom;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private static final String GAME_TITLE = "Jogo Gourmet";
    private static final Integer WINDOW_WIDTH = 400;
    private static final Integer WINDOW_HEIGHT = 400;

    public Main() throws HeadlessException {
        showInitialMessage();
        configureGame();
    }

    private void showInitialMessage() {
        MealFinder mealFinder = new MealFinder();

        JPanel initialPanel = new JPanel();
        initialPanel.add(new JLabel("Pense em um prato que gosta"));
        initialPanel.add(new StartButtom(mealFinder));

        this.add(initialPanel);
    }

    private void configureGame() {
        setTitle(GAME_TITLE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
