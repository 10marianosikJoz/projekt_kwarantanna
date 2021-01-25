package get_final_price_from_items;

import shopping_cart_textfields.VegetableOnionTextFields;

import java.math.BigDecimal;

public class ShoppingCartOnionOperations {
    private static VegetableOnionTextFields vegetableOnionTextFields = new VegetableOnionTextFields();
    private BigDecimal onionAmount;
    private BigDecimal onionPrice;
    private BigDecimal finalResult;


    public BigDecimal getOnionAmount(){
        onionAmount = new BigDecimal(vegetableOnionTextFields.getOnionAmount().getText());
        return onionAmount;
    }

    public BigDecimal getOnionPrice(){
        onionPrice = new BigDecimal(vegetableOnionTextFields.getOnionPrice().getText());
        return onionPrice;
    }
    public BigDecimal getOnionFinalPrice(){
        finalResult = getOnionAmount().multiply(getOnionPrice());
        return finalResult;
    }
}
