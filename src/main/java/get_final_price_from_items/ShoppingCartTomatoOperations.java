package get_final_price_from_items;

import shopping_cart_textfields.VegetableTomatoTextFields;

import java.math.BigDecimal;

public class ShoppingCartTomatoOperations {
    private static VegetableTomatoTextFields vegetableTomatoTextFields = new VegetableTomatoTextFields();
    private BigDecimal tomatoAmount;
    private BigDecimal tomatoPrice;
    private BigDecimal finalResult;


    public BigDecimal getTomatoAmount(){
        tomatoAmount = new BigDecimal(vegetableTomatoTextFields.getTomatoAmount().getText());
        return tomatoAmount;
    }

    public BigDecimal getTomatoPrice(){
        tomatoPrice = new BigDecimal(vegetableTomatoTextFields.getTomatoPrice().getText());
        return tomatoPrice;
    }
    public BigDecimal getTomatoFinalPrice(){
        finalResult = getTomatoAmount().multiply(getTomatoPrice());
        return finalResult;
    }
}
