package get_final_price_from_items;

import shopping_cart_textfields.BreadBaguetteTextFields;
import shopping_cart_textfields.FruitPlumTextFields;

import java.math.BigDecimal;

public class ShoppingCartPlumOperations {
    private static FruitPlumTextFields fruitPlumTextFields = new FruitPlumTextFields();
    private BigDecimal baguetteAmount;
    private BigDecimal baguettePrice;
    private BigDecimal finalResult;


    public BigDecimal getPlumAmount(){
        baguetteAmount = new BigDecimal(fruitPlumTextFields.getPlumAmount().getText());
        return baguetteAmount;
    }

    public BigDecimal getPlumPrice(){
        baguettePrice = new BigDecimal(fruitPlumTextFields.getPlumPrice().getText());
        return baguettePrice;
    }
    public BigDecimal getPlumFinalPrice(){
        finalResult = getPlumAmount().multiply(getPlumPrice());
        return finalResult;
    }
}
