package get_final_price_from_items;

import shopping_cart_textfields.VegetableSaladTextFields;

import java.math.BigDecimal;

public class ShoppingCartSaladOperations {
    private static VegetableSaladTextFields vegetableSaladTextFields = new VegetableSaladTextFields();
    private BigDecimal saladAmount;
    private BigDecimal saladPrice;
    private BigDecimal finalResult;


    public BigDecimal getSaladAmount(){
        saladAmount = new BigDecimal(vegetableSaladTextFields.getSaladAmount().getText());
        return saladAmount;
    }

    public BigDecimal getSaladPrice(){
        saladPrice = new BigDecimal(vegetableSaladTextFields.getSaladPrice().getText());
        return saladPrice;
    }
    public BigDecimal getSaladFinalPrice(){
        finalResult = getSaladAmount().multiply(getSaladPrice());
        return finalResult;
    }
}
