package org.effectivejava.examples.ch02.item02;

public class BuilderNutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrates;

    public static class Builder implements org.effectivejava.examples.ch02.item02.Builder<BuilderNutritionFacts> {
        private final int servingSize;
        private final int servings;

        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrates;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        public Builder setCalories(int val) {
            calories = val; return this;
        }

        public Builder setFat(int val) {
            fat = val; return this;
        }

        public Builder setSodium(int val) {
            sodium = val; return this;
        }

        public Builder setCarbohydrates(int val) {
            carbohydrates = val; return this;
        }

        public BuilderNutritionFacts build() {
            return new BuilderNutritionFacts(this);
        }
    }

    public BuilderNutritionFacts(Builder b) {
        servingSize = b.servingSize;
        servings = b.servings;
        calories = b.calories;
        fat = b.fat;
        sodium = b.sodium;
        carbohydrates = b.carbohydrates;
    }
//
//    Use the above builder pattern as :
//    public static void main(String[] args) {
//        BuilderNutritionFacts nf = new Builder(100, 1)
//                .setCalories(100)
//                .setFat(10)
//                .setSodium(20)
//                .setCarbohydrates(20)
//                .build();
//
//    }
}

