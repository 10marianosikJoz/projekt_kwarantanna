package get_final_price_from_items;

import shopping_cart_textfields.FruitPearTextFields;

import java.math.BigDecimal;

public class ShoppingCartPearOperations {
    private static FruitPearTextFields fruitPearTextFields = new FruitPearTextFields();
    private BigDecimal pearAmount;
    private BigDecimal pearPrice;
    private BigDecimal finalResult;


    public BigDecimal getPearAmount(){
        pearAmount = new BigDecimal(fruitPearTextFields.getPearAmount().getText());
        return pearAmount;
    }

    public BigDecimal getPearPrice(){
        pearPrice = new BigDecimal(fruitPearTextFields.getPearPrice().getText());
        return pearPrice;
    }
    public BigDecimal getPearFinalPrice(){
        finalResult = getPearAmount().multiply(getPearPrice());
        return finalResult;
    }
}
