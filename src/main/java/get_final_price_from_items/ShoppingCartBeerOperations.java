package get_final_price_from_items;

import shopping_cart_textfields.DrinkBeerTextFields;

import java.math.BigDecimal;

public class ShoppingCartBeerOperations {
    private static DrinkBeerTextFields drinkBeerTextFields = new DrinkBeerTextFields();
    private BigDecimal beerAmount;
    private BigDecimal beerPrice;
    private BigDecimal finalResult;


    public BigDecimal getBeerAmount(){
        beerAmount = new BigDecimal(drinkBeerTextFields.getBeerAmount().getText());
        return beerAmount;
    }

    public BigDecimal getBeerPrice(){
        beerPrice = new BigDecimal(drinkBeerTextFields.getBeerPrice().getText());
        return beerPrice;
    }
    public BigDecimal getBeerFinalPrice(){
        finalResult = getBeerAmount().multiply(getBeerPrice());
        return finalResult;
    }
}
