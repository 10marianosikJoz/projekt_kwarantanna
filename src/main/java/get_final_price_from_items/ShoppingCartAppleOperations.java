package get_final_price_from_items;

import shopping_cart_textfields.FruitAppleTextFields;

import java.math.BigDecimal;

public class ShoppingCartAppleOperations {
    private static FruitAppleTextFields fruitAppleTextFields = new FruitAppleTextFields();
    private BigDecimal appleAmount;
    private BigDecimal applePrice;
    private BigDecimal finalResult;


    public BigDecimal getAppleAmount(){
        appleAmount = new BigDecimal(fruitAppleTextFields.getAppleAmount().getText());
        return appleAmount;
    }

    public BigDecimal getApplePrice(){
        applePrice = new BigDecimal(fruitAppleTextFields.getApplePrice().getText());
        return applePrice;
    }
    public BigDecimal getAppleFinalPrice(){
        finalResult = getAppleAmount().multiply(getApplePrice());
        return finalResult;
    }
}
