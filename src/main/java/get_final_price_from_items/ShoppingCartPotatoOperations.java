package get_final_price_from_items;

import shopping_cart_textfields.VegetableCucumberTextFields;

import java.math.BigDecimal;

public class ShoppingCartPotatoOperations {
    private static VegetableCucumberTextFields vegetableCucumberTextFields = new VegetableCucumberTextFields();
    private BigDecimal potatoAmount;
    private BigDecimal potatoPrice;
    private BigDecimal finalResult;


    public BigDecimal getPotatoAmount(){
        potatoAmount = new BigDecimal(vegetableCucumberTextFields.getCucumberAmount().getText());
        return potatoAmount;
    }

    public BigDecimal getPotatoPrice(){
        potatoPrice = new BigDecimal(vegetableCucumberTextFields.getCucumberPrice().getText());
        return potatoPrice;
    }
    public BigDecimal getPotatoFinalPrice(){
        finalResult = getPotatoAmount().multiply(getPotatoPrice());
        return finalResult;
    }
}
