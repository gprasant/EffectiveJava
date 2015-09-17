package org.effectivejava.examples.ch02.item02;

/**
 * Created by pguruprasad on 9/17/15.
 */
public class JavaBeansNutritionFacts {
    private int servingSize = -1; // required, no default value
    private int servings = -1; // required, no default value
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrates = 0;

    public JavaBeansNutritionFacts() {
    }

    // Setters
    public void setServingSize(int val) {
        servingSize = val;
    }

    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {
        calories = val;
    }

    public void setFat(int val) {
        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrates(int val) {
        carbohydrates = val;
    }
}

/*
Create instances like this :
JavaBeansNutritionFacts n = new JavaBeansNutritionFacts();
    n.setServings(1);
    n.setServingSize(100);
    n.setCalories(500);
    n.setFat(20);
    n.setSodium(8);
    n.setCarbohydrates(16);
 */
