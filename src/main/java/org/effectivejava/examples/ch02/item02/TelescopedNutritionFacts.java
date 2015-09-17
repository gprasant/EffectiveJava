package org.effectivejava.examples.ch02.item02;


public class TelescopedNutritionFacts {
    private final int servingSize; // required
    private final int servings; // required
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrates;

    public TelescopedNutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public TelescopedNutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public TelescopedNutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public TelescopedNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
         this(servingSize, servings, calories, fat, sodium, 0);
    }

    public TelescopedNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrates) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
    }
}
