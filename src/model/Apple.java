package model;

import model.constants.Discount;

public class Apple extends Food implements Discountable{
    private String colour;

    public Apple(int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals("red")){
            return Discount.appleDiscount;
        } else {
            return Discount.noDiscount;
        }
    }
}
