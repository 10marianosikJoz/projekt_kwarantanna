package get_final_price_from_items;

import shopping_cart_textfields.BreadToastTextFields;

import java.math.BigDecimal;

public class ShoppingCartToastOperations {
    private static BreadToastTextFields breadToastTextFields = new BreadToastTextFields();
    private BigDecimal toastAmount;
    private BigDecimal toastPrice;
    private BigDecimal finalResult;


    public BigDecimal getToastAmount(){
        toastAmount = new BigDecimal(breadToastTextFields.getToastAmount().getText());
        return toastAmount;
    }

    public BigDecimal getToastPrice(){
        toastPrice = new BigDecimal(breadToastTextFields.getToastPrice().getText());
        return toastPrice;
    }
    public BigDecimal getBaguetteFinalPrice(){
        finalResult = getToastAmount().multiply(getToastPrice());
        return finalResult;
    }
}
