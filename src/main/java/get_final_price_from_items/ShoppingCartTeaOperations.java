package get_final_price_from_items;

import shopping_cart_textfields.DrinkColaTextFields;
import shopping_cart_textfields.DrinkTeaTextFields;

import java.math.BigDecimal;

public class ShoppingCartTeaOperations {

    private static DrinkColaTextFields drinkColaTextFields = new DrinkColaTextFields();
    private static DrinkTeaTextFields drinkTeaTextFields = new DrinkTeaTextFields();
    private BigDecimal teaAmount;
    private BigDecimal teaPrice;
    private BigDecimal teaFinalResult;


    public BigDecimal getTeaAmount(){
        teaAmount = new BigDecimal(drinkTeaTextFields.getTeaAmount().getText());
        return teaAmount;
    }

    public BigDecimal getTeaPrice(){
        teaPrice = new BigDecimal(drinkTeaTextFields.getTeaPrice().getText());
        return teaPrice;
    }
    public BigDecimal getTeaFinalPrice(){
        teaFinalResult = getTeaAmount().multiply(getTeaPrice());
        return teaFinalResult;
    }

}
