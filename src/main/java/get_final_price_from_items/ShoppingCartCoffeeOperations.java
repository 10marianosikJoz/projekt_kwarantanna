package get_final_price_from_items;

import shopping_cart_textfields.DrinkCoffeeTextFields;

import java.math.BigDecimal;

public class ShoppingCartCoffeeOperations {
    private static DrinkCoffeeTextFields drinkCoffeeTextFields = new DrinkCoffeeTextFields();
    private BigDecimal coffeeAmount;
    private BigDecimal coffeePrice;
    private BigDecimal finalResult;


    public BigDecimal getCoffeeAmount(){
        coffeeAmount = new BigDecimal(drinkCoffeeTextFields.getCoffeeAmount().getText());
        return coffeeAmount;
    }

    public BigDecimal getCoffeePrice(){
        coffeePrice = new BigDecimal(drinkCoffeeTextFields.getCoffeePrice().getText());
        return coffeePrice;
    }
    public BigDecimal getCoffeeFinalPrice(){
        finalResult = getCoffeeAmount().multiply(getCoffeePrice());
        return finalResult;
    }
}
