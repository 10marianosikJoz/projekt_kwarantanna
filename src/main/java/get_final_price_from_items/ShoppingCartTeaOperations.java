package get_final_price_from_items;

import shopping_card_textfields.DrinkTextFields;

import java.math.BigDecimal;

public class ShoppingCartTeaOperations {

    private static DrinkTextFields drinkTextFields = new DrinkTextFields();
    private BigDecimal teaAmount;
    private BigDecimal teaPrice;
    private BigDecimal teaFinalResult;


    public BigDecimal getTeaAmount(){
        teaAmount = new BigDecimal(drinkTextFields.getTeaAmount().getText());
        return teaAmount;
    }

    public BigDecimal getTeaPrice(){
        teaPrice = new BigDecimal(drinkTextFields.getTeaPrice().getText());
        return teaPrice;
    }
    public BigDecimal getTeaFinalPrice(){
        teaFinalResult = getTeaAmount().multiply(getTeaPrice());
        return teaFinalResult;
    }

}
