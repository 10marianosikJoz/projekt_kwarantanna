package get_final_price_from_items;

import shopping_cart_textfields.DrinkWaterTextFields;

import java.math.BigDecimal;

public class ShoppingCartWaterOperations {
    private static DrinkWaterTextFields drinkWaterTextFields = new DrinkWaterTextFields();
    private BigDecimal waterAmount;
    private BigDecimal waterPrice;
    private BigDecimal finalResult;


    public BigDecimal getWaterAmount(){
        waterAmount = new BigDecimal(drinkWaterTextFields.getWaterAmount().getText());
        return waterAmount;
    }

    public BigDecimal getWaterPrice(){
        waterPrice = new BigDecimal(drinkWaterTextFields.getWaterPrice().getText());
        return waterPrice;
    }
    public BigDecimal getWaterFinalPrice(){
        finalResult = getWaterAmount().multiply(getWaterPrice());
        return finalResult;
    }
}
