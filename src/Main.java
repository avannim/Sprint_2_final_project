import model.*;
import model.service.*;
import model.constants.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Food product1 = new Meat(5,100);
        Food product2 = new Apple(10,50, Colour.red);
        Food product3 = new Apple(8, 60, Colour.green);

        Food[] arr = {product1, product2, product3};
        ShoppingCart cart = new ShoppingCart(arr);

        System.out.println(cart.getSumDiscount());
        System.out.println(cart.getSumNoDiscount());
        System.out.println(cart.getSumVegetarian());
    }
}