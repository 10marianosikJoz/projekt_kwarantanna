package get_final_price_from_items;

import shopping_cart_textfields.BreadBaguetteTextFields;
import shopping_cart_textfields.BreadRollTextFields;

import java.math.BigDecimal;

public class ShoppingCartRollOperations {
    private static BreadRollTextFields breadRollTextFields = new BreadRollTextFields();
    private BigDecimal rollAmount;
    private BigDecimal rollPrice;
    private BigDecimal finalResult;


    public BigDecimal getRollAmount(){
        rollAmount = new BigDecimal(breadRollTextFields.getRollAmount().getText());
        return rollAmount;
    }

    public BigDecimal getRollPrice(){
        rollPrice = new BigDecimal(breadRollTextFields.getRollPrice().getText());
        return rollPrice;
    }
    public BigDecimal getRollFinalPrice(){
        finalResult = getRollAmount().multiply(getRollPrice());
        return finalResult;
    }
}
