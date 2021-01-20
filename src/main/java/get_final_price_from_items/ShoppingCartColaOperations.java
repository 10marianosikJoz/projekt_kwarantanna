package get_final_price_from_items;

import shopping_card_textfields.DrinkTextFields;

import java.math.BigDecimal;

public class ShoppingCartColaOperations {
    private static DrinkTextFields drinkTextFields = new DrinkTextFields();
    private BigDecimal colaAmount;
    private BigDecimal colaPrice;
    private BigDecimal finalResult;


    public BigDecimal getColaAmount(){
        colaAmount = new BigDecimal(drinkTextFields.getAmount().getText());
        return colaAmount;
    }

    public BigDecimal getColaPrice(){
        colaPrice = new BigDecimal(drinkTextFields.getPrice().getText());
        return colaPrice;
    }
    public BigDecimal getColaFinalPrice(){
        finalResult = getColaAmount().multiply(getColaPrice());
        return finalResult;
    }


}
