package get_final_price_from_items;

import shopping_cart_textfields.DrinkColaTextFields;

import java.math.BigDecimal;

public class ShoppingCartColaOperations {
    private static DrinkColaTextFields drinkColaTextFields = new DrinkColaTextFields();
    private BigDecimal colaAmount;
    private BigDecimal colaPrice;
    private BigDecimal finalResult;


    public BigDecimal getColaAmount(){
        colaAmount = new BigDecimal(drinkColaTextFields.getColaAmount().getText());
        return colaAmount;
    }

    public BigDecimal getColaPrice(){
        colaPrice = new BigDecimal(drinkColaTextFields.getColaPrice().getText());
        return colaPrice;
    }
    public BigDecimal getColaFinalPrice(){
        finalResult = getColaAmount().multiply(getColaPrice());
        return finalResult;
    }


}
