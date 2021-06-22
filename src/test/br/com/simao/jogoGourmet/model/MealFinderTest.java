package br.com.simao.jogoGourmet.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author: simão
 */
public class MealFinderTest {

    @Test
    @DisplayName("test search for meal 'Lasanha' ")
    public void givenMealLasanhaWhenExecuteThenCheckEndGame() {
        MealFinder mealFinder = Mockito.spy(new MealFinder());

        Mockito.doReturn(true).when(mealFinder).askForMeal("Massa");
        Mockito.doReturn(true).when(mealFinder).askForMeal("Lasanha");

        mealFinder.execute();
        Meal findedMeal = mealFinder.getActualMeal();

        Assertions.assertTrue(mealFinder.isGameWon());
        Assertions.assertEquals(findedMeal.getValue(), "Lasanha");
    }

    @Test
    @DisplayName("Insert new Meal and research for it")
    public void givenMealBoloDeLaranjaWhenExecuteThenCheckEndGame() {
        MealFinder mealFinder = Mockito.spy(new MealFinder());

        createInexistentMeal(mealFinder);

        Mockito.doReturn(false).when(mealFinder).askForMeal("Massa");
        Mockito.doReturn(true).when(mealFinder).askForMeal("Cenoura");
        Mockito.doReturn(true).when(mealFinder).askForMeal("Bolo de Cenoura");

        mealFinder.execute();
        Meal findedMeal = mealFinder.getActualMeal();

        Assertions.assertTrue(mealFinder.isGameWon());
        Assertions.assertEquals(findedMeal.getValue(), "Bolo de Cenoura");
    }

    public void createInexistentMeal(MealFinder mealFinder) {
        Mockito.doReturn(false).when(mealFinder).askForMeal("Massa");
        Mockito.doReturn(false).when(mealFinder).askForMeal("Bolo de Chocolate");
        Mockito.doReturn("Bolo de Cenoura").when(mealFinder).askForNewMeal();
        Mockito.doReturn("Cenoura").when(mealFinder).askForDifference("Bolo de Cenoura", "Bolo de chocolate");

        mealFinder.execute();
    }
}
