package get_final_price_from_items;

import shopping_cart_textfields.DrinkJuiceTextFields;

import java.math.BigDecimal;

public class ShoppingCartJuiceOperations {
    private static DrinkJuiceTextFields drinkJuiceTextFields = new DrinkJuiceTextFields();
    private BigDecimal juiceAmount;
    private BigDecimal juicePrice;
    private BigDecimal finalResult;


    public BigDecimal getJuiceAmount(){
        juiceAmount = new BigDecimal(drinkJuiceTextFields.getJuiceAmount().getText());
        return juiceAmount;
    }

    public BigDecimal getJuicePrice(){
        juicePrice = new BigDecimal(drinkJuiceTextFields.getJuicePrice().getText());
        return juicePrice;
    }
    public BigDecimal getJuiceFinalPrice(){
        finalResult = getJuiceAmount().multiply(getJuicePrice());
        return finalResult;
    }
}
