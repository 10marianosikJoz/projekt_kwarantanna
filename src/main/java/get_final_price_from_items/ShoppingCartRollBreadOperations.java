package get_final_price_from_items;

import shopping_cart_textfields.BreadBaguetteTextFields;
import shopping_cart_textfields.BreadRollBreadTextFields;

import java.math.BigDecimal;

public class ShoppingCartRollBreadOperations {
    private static BreadRollBreadTextFields breadRollBreadTextFields = new BreadRollBreadTextFields();
    private BigDecimal rollBreadAmount;
    private BigDecimal rollBreadPrice;
    private BigDecimal finalResult;


    public BigDecimal getRollBreadAmount(){
        rollBreadAmount = new BigDecimal(breadRollBreadTextFields.getRollBreadAmount().getText());
        return rollBreadAmount;
    }

    public BigDecimal getRollBreadPrice(){
        rollBreadPrice = new BigDecimal(breadRollBreadTextFields.getRollBreadPrice().getText());
        return rollBreadPrice;
    }
    public BigDecimal getRollBreadFinalPrice(){
        finalResult = getRollBreadAmount().multiply(getRollBreadPrice());
        return finalResult;
    }
}
