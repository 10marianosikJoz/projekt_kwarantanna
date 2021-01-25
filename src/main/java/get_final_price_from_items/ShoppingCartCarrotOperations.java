package get_final_price_from_items;

import shopping_cart_textfields.FruitAppleTextFields;
import shopping_cart_textfields.VegetableCarrotTextFields;

import java.math.BigDecimal;

public class ShoppingCartCarrotOperations {
    private static VegetableCarrotTextFields vegetableCarrotTextFields = new VegetableCarrotTextFields();
    private BigDecimal carrotAmount;
    private BigDecimal carrotPrice;
    private BigDecimal finalResult;


    public BigDecimal getAppleAmount(){
        carrotAmount = new BigDecimal(vegetableCarrotTextFields.getCarrotAmount().getText());
        return carrotAmount;
    }

    public BigDecimal getApplePrice(){
        carrotPrice = new BigDecimal(vegetableCarrotTextFields.getCarrotPrice().getText());
        return carrotPrice;
    }
    public BigDecimal getCarrotFinalPrice(){
        finalResult = getAppleAmount().multiply(getApplePrice());
        return finalResult;
    }
}
