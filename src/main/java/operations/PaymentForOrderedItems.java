package operations;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import scenes_init.AccountInfoScene;
import scenes_init.BreadOptionScene;
import shopping_cart_textfields.DrinkColaTextFields;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PaymentForOrderedItems {
    private static AccountInfoScene accountInfoScene = new AccountInfoScene();
    private static DrinkColaTextFields drinkColaTextFields = new DrinkColaTextFields();
    private BigDecimal availableMoney;
    private BigDecimal totalSumOfMoneyForOrderedItems;
    private BigDecimal subtractedMoney;

    public BigDecimal getAvailableMoney() {
        availableMoney = new BigDecimal(accountInfoScene.getTotalAmount().getText());
        return availableMoney;
    }
    public BigDecimal getTotalSumOfMoneyForOrderedItems() {
        totalSumOfMoneyForOrderedItems = new BigDecimal(drinkColaTextFields.getTotalSumOfAllItems().getText());
        return totalSumOfMoneyForOrderedItems;
    }

    public BigDecimal subtractMoneyFromAccount() {
        if(getAvailableMoney().compareTo(getTotalSumOfMoneyForOrderedItems()) > 0){
            subtractedMoney = getAvailableMoney().subtract(getTotalSumOfMoneyForOrderedItems());
        }

        return subtractedMoney;
    }


}
