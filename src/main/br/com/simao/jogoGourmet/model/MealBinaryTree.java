package main.br.com.simao.jogoGourmet.model;

public class MealBinaryTree {

    private Meal firstMeal;

    public MealBinaryTree() {
        firstMeal = new Meal("Massa");
        firstMeal.setLeft(new Meal("Lasanha") );
        firstMeal.setRight( new Meal("Bolo de Chocolate") );
    }

    public void addMeal(Meal actualMeal, String mealDifference, String newMeal) {
        String mealToSwap = actualMeal.getValue();

        actualMeal.setValue(mealDifference);
        actualMeal.setLeft(new Meal(newMeal));
        actualMeal.setRight(new Meal(mealToSwap));
    }

    public Meal getFirstMeal() {
        return firstMeal;
    }
}
