package get_final_price_from_items;

import shopping_card_textfields.DrinkTextFields;

import java.math.BigDecimal;

public class ShoppingCartFinalPrice {

    private static DrinkTextFields drinkTextFields = new DrinkTextFields();
    private BigDecimal colaTotalAmount;
    private BigDecimal teaTotalPrice;
    private BigDecimal finalResult;


    public BigDecimal getColaTotalPrice(){
        colaTotalAmount = new BigDecimal(drinkTextFields.getTotalSum().getText());
        return colaTotalAmount;
    }

    public BigDecimal getTeaTotalPrice(){
        teaTotalPrice = new BigDecimal(drinkTextFields.getTeaTotalSum().getText());
        return teaTotalPrice;
    }
    public BigDecimal getTotalPrice(){
        finalResult = getColaTotalPrice().add(getTeaTotalPrice());
        return finalResult;
    }
}
