package main.br.com.simao.jogoGourmet.model;
import main.br.com.simao.jogoGourmet.view.AskMealMessage;
import main.br.com.simao.jogoGourmet.view.CreateMealMessage;
import main.br.com.simao.jogoGourmet.view.WinMessage;

public class MealFinder {

    private final MealBinaryTree meals;
    private Meal actualMeal;
    private Boolean isFinded;
    private Boolean isEnded;

    public MealFinder() {
        meals = new MealBinaryTree();

    }

    public void execute() {
        initialize();

        while(!isEnded) {
            findMeal();
        }

        if(isFinded){
            new WinMessage();
        }
    }

    private void initialize() {
        actualMeal = meals.getFirstMeal();
        isFinded = false;
        isEnded = false;
    }

    private void findMeal() {
        Boolean answeredYes = AskMealMessage.ask(actualMeal.getValue());

        if (actualMeal.isMealLeaf()) {

            if (answeredYes) {
                isEnded = true;
                isFinded = true;
            } else {
                mealDoestExist();
            }
        } else if (answeredYes) {
            actualMeal = actualMeal.getLeft();
        } else {
            actualMeal = actualMeal.getRight();
        }
    }

    private void mealDoestExist() {
        String newMeal = CreateMealMessage.askForMeal();
        String difference = CreateMealMessage.askForDifference(newMeal, actualMeal.getValue());

        meals.addMeal(actualMeal, difference, newMeal);
        isEnded = true;
    }

}
