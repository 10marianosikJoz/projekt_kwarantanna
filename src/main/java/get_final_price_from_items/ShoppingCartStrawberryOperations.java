package get_final_price_from_items;

import shopping_cart_textfields.FruitStrawberryTextFields;

import java.math.BigDecimal;

public class ShoppingCartStrawberryOperations {
    private static FruitStrawberryTextFields fruitStrawberryTextFields = new FruitStrawberryTextFields();
    private BigDecimal strawberryAmount;
    private BigDecimal strawberryPrice;
    private BigDecimal finalResult;


    public BigDecimal getStrawberryAmount(){
        strawberryAmount = new BigDecimal(fruitStrawberryTextFields.getStrawberryAmount().getText());
        return strawberryAmount;
    }

    public BigDecimal getStrawberryPrice(){
        strawberryPrice = new BigDecimal(fruitStrawberryTextFields.getStrawberryPrice().getText());
        return strawberryPrice;
    }
    public BigDecimal getStrawberryFinalPrice(){
        finalResult = getStrawberryAmount().multiply(getStrawberryPrice());
        return finalResult;
    }
}
