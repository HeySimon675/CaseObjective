package br.com.simao.jogoGourmet.model;
import br.com.simao.jogoGourmet.view.AskMealMessage;
import br.com.simao.jogoGourmet.view.CreateMealMessage;
import br.com.simao.jogoGourmet.view.WinMessage;

/**
 * @author: simão
 */
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
        Boolean answeredYes = askForMeal(actualMeal.getValue());

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
        String newMeal = askForNewMeal();
        String difference = askForDifference(newMeal, actualMeal.getValue());

        meals.addMeal(actualMeal, difference, newMeal);
        isEnded = true;
    }

    public Boolean isGameWon() {
        return (isEnded && isFinded);
    }

    public Boolean askForMeal(String mealName) {
        return new AskMealMessage().ask(mealName);
    }

    public String askForNewMeal() {
        return new CreateMealMessage().askForMeal();
    }

    public String askForDifference(String newMealName, String actualMealName) {
        return new CreateMealMessage().askForDifference(newMealName, actualMealName);
    }

    public final Meal getActualMeal() {
        return actualMeal;
    }
}
