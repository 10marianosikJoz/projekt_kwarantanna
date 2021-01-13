package operations;

import javafx.scene.control.TextField;
import scenes_init.AccountInfoScene;
import scenes_init.FruitOptionScene;

import java.math.BigDecimal;

public class TransferBankSceneOperation {
    private static AccountInfoScene accountInfoScene = new AccountInfoScene();
    private static FruitOptionScene fruitOptionScene = new FruitOptionScene();
    private BigDecimal convertAmount;

    private TextField getAccountInfoTotalAmountField() {
        return accountInfoScene.getTotalAmount();
    }

    private String getTextFromField() {
        return fruitOptionScene.getTextFields().get(3).getText();
    }

    private BigDecimal convertToBigDecimal() {
        String amountValue = getAccountInfoTotalAmountField().getText();
        convertAmount = new BigDecimal(amountValue);

        return convertAmount;
    }

    public void Operations() {
        BigDecimal convert = new BigDecimal(getTextFromField());
        BigDecimal score = convertToBigDecimal().subtract(convert);
        if (convertAmount.compareTo(convert) == 0) {
            accountInfoScene.getTotalAmount().setText(score.toString());
        } else if (convertAmount.compareTo(convert) > 0) {
            accountInfoScene.getTotalAmount().setText(score.toString());
        }


    }
}
