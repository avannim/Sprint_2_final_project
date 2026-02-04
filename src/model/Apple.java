package model;

import model.constants.*;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)){
            return Discount.APPLE_DICOUNT;
        } else {
            return Discount.NO_DISCOUNT;
        }
    }
}
