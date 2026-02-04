package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] cart;

    public ShoppingCart(Food[] cart){
        this.cart = cart;
    }

    public double getSumNoDiscount(){
        double sum = 0;
        for (Food food : this.cart) {
            double productSum = food.getPrice() * food.getAmount();
            sum = productSum + sum;
        }
        return sum;
    }

    public double getSumDiscount(){
        double sum = 0;
        for (Food food : this.cart) {
            double productSum = food.getPrice() * food.getAmount();
            sum = sum + (productSum - productSum / 100 * food.getDiscount());
        }
        return sum;
    }

    public double getSumVegetarian(){
        double sum = 0;
        for (Food food : this.cart) {
            if (food.isVegetarian()) {
                double productSum = food.getPrice() * food.getAmount();
                sum = productSum + sum;
            }
        }
        return sum;
    }
}
