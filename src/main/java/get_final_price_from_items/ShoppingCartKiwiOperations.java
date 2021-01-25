package get_final_price_from_items;

import shopping_cart_textfields.FruitKiwiTextFields;

import java.math.BigDecimal;

public class ShoppingCartKiwiOperations {
    private static FruitKiwiTextFields fruitKiwiTextFields = new FruitKiwiTextFields();
    private BigDecimal kiwiAmount;
    private BigDecimal kiwiPrice;
    private BigDecimal finalResult;


    public BigDecimal getKiwiAmount(){
        kiwiAmount = new BigDecimal(fruitKiwiTextFields.getKiwiAmount().getText());
        return kiwiAmount;
    }

    public BigDecimal getKiwiPrice(){
        kiwiPrice = new BigDecimal(fruitKiwiTextFields.getKiwiPrice().getText());
        return kiwiPrice;
    }
    public BigDecimal getKiwiFinalPrice(){
        finalResult = getKiwiAmount().multiply(getKiwiPrice());
        return finalResult;
    }
}
