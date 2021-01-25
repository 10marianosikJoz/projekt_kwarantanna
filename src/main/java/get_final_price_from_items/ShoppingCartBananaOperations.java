package get_final_price_from_items;

import shopping_cart_textfields.FruitBananaTextFields;

import java.math.BigDecimal;

public class ShoppingCartBananaOperations {
    private static FruitBananaTextFields fruitBananaTextFields = new FruitBananaTextFields();
    private BigDecimal bananaAmount;
    private BigDecimal bananaPrice;
    private BigDecimal finalResult;


    public BigDecimal getBananaAmount(){
        bananaAmount = new BigDecimal(fruitBananaTextFields.getBananaAmount().getText());
        return bananaAmount;
    }

    public BigDecimal getBananaPrice(){
        bananaPrice = new BigDecimal(fruitBananaTextFields.getBananaPrice().getText());
        return bananaPrice;
    }
    public BigDecimal getBananaFinalPrice(){
        finalResult = getBananaAmount().multiply(getBananaPrice());
        return finalResult;
    }
}
