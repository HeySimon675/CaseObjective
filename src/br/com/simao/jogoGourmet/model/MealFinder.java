package br.com.simao.jogoGourmet.model;
import br.com.simao.jogoGourmet.view.AskMealMessage;

public class MealFinder {

    private Meal firstMeal;
    private Meal actualMeal;
    private String message;
    private Boolean isFinded = false;

    public MealFinder() {
        createDefaultMeals();
    }

    public void execute() {
        while(!isFinded) {
            findMeal();
        }
    }

    private void findMeal() {
        isFinded = AskMealMessage.ask(firstMeal.getValue());

        if(!isFinded) {

        }
    }

    private void createDefaultMeals() {
        firstMeal = new Meal("Massa");
        firstMeal.setLeft(new Meal("Lasanha") );
        firstMeal.setRight( new Meal("Bolo de chocolate") );
        actualMeal = firstMeal;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
