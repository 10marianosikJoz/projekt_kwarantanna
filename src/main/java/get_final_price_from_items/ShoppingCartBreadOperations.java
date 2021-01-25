package get_final_price_from_items;

import shopping_cart_textfields.BreadTextFields;

import java.math.BigDecimal;

public class ShoppingCartBreadOperations {
    private static BreadTextFields breadTextFields = new BreadTextFields();
    private BigDecimal breadAmount;
    private BigDecimal breadPrice;
    private BigDecimal finalResult;


    public BigDecimal getBreadAmount(){
        breadAmount = new BigDecimal(breadTextFields.getBreadAmount().getText());
        return breadAmount;
    }

    public BigDecimal getBreadPrice(){
        breadPrice = new BigDecimal(breadTextFields.getBreadPrice().getText());
        return breadPrice;
    }
    public BigDecimal getBreadFinalPrice(){
        finalResult = getBreadAmount().multiply(getBreadPrice());
        return finalResult;
    }
}
