package get_final_price_from_items;

import shopping_cart_textfields.VegetablePaprikaTextFields;

import java.math.BigDecimal;

public class ShoppingCartPaprikaOperations {
    private static VegetablePaprikaTextFields vegetablePaprikaTextFields = new VegetablePaprikaTextFields();
    private BigDecimal paprikaAmount;
    private BigDecimal paprikaPrice;
    private BigDecimal finalResult;


    public BigDecimal getPaprikaAmount(){
        paprikaAmount = new BigDecimal(vegetablePaprikaTextFields.getPaprikaAmount().getText());
        return paprikaAmount;
    }

    public BigDecimal getPaprikaPrice(){
        paprikaPrice = new BigDecimal(vegetablePaprikaTextFields.getPaprikaPrice().getText());
        return paprikaPrice;
    }
    public BigDecimal getPaprikaFinalPrice(){
        finalResult = getPaprikaAmount().multiply(getPaprikaPrice());
        return finalResult;
    }
}
