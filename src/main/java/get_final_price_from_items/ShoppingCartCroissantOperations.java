package get_final_price_from_items;

import shopping_cart_textfields.BreadBaguetteTextFields;
import shopping_cart_textfields.BreadCroissantTextFields;

import java.math.BigDecimal;

public class ShoppingCartCroissantOperations {
    private static BreadCroissantTextFields breadCroissantTextFields = new BreadCroissantTextFields();
    private BigDecimal croissantAmount;
    private BigDecimal croissantPrice;
    private BigDecimal finalResult;


    public BigDecimal getCroissantAmount(){
        croissantAmount = new BigDecimal(breadCroissantTextFields.getCroissantAmount().getText());
        return croissantAmount;
    }

    public BigDecimal getCroissantPrice(){
        croissantPrice = new BigDecimal(breadCroissantTextFields.getCroissantPrice().getText());
        return croissantPrice;
    }
    public BigDecimal getBaguetteFinalPrice(){
        finalResult = getCroissantAmount().multiply(getCroissantPrice());
        return finalResult;
    }
}
