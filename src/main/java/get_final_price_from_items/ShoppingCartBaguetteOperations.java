package get_final_price_from_items;

import shopping_cart_textfields.BreadBaguetteTextFields;

import java.math.BigDecimal;

public class ShoppingCartBaguetteOperations {
    private static BreadBaguetteTextFields breadBaguetteTextFields = new BreadBaguetteTextFields();
    private BigDecimal baguetteAmount;
    private BigDecimal baguettePrice;
    private BigDecimal finalResult;


    public BigDecimal getBaguetteAmount(){
        baguetteAmount = new BigDecimal(breadBaguetteTextFields.getBaguetteAmount().getText());
        return baguetteAmount;
    }

    public BigDecimal getBaguettePrice(){
        baguettePrice = new BigDecimal(breadBaguetteTextFields.getBaguettePrice().getText());
        return baguettePrice;
    }
    public BigDecimal getBaguetteFinalPrice(){
        finalResult = getBaguetteAmount().multiply(getBaguettePrice());
        return finalResult;
    }
}
