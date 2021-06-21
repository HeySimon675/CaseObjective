package main.br.com.simao.jogoGourmet.view;

import main.br.com.simao.jogoGourmet.model.MealFinder;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StartButtom extends JButton implements MouseListener {

    private MealFinder mealFinder;

    public StartButtom(MealFinder mealFinder) {
        super("OK");
        this.mealFinder = mealFinder;
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mealFinder.execute();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
