package operations;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import scenes_init.AccountInfoScene;
import scenes_init.BreadOptionScene;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PublicTransportOperation {
    private static AccountInfoScene accountInfoScene = new AccountInfoScene();
    private final BigDecimal firstTicket = new BigDecimal(2);
    private final BigDecimal secondTicket = new BigDecimal(3);
    private final BigDecimal thirdTicket = new BigDecimal(4);
    private BreadOptionScene breadOptionScene = new BreadOptionScene();
    private BigDecimal convertAmount;


    private TextField getAccountInfoTotalAmountField() {
        return accountInfoScene.getTotalAmount();
    }

    private BigDecimal convertToBigDecimal() {
        String amountValue = getAccountInfoTotalAmountField().getText();
        convertAmount = new BigDecimal(amountValue);

        return convertAmount;
    }

    private ArrayList<ToggleButton> toggleButton() {

        return breadOptionScene.getToggleButtons();
    }

    public void Operations() {
        BigDecimal firstResult = convertToBigDecimal().subtract(firstTicket);
        BigDecimal secondResult = convertToBigDecimal().subtract(secondTicket);
        BigDecimal thirdResult = convertToBigDecimal().subtract(thirdTicket);

        if (toggleButton().get(0).isSelected()) {
            accountInfoScene.getTotalAmount().setText(firstResult.toString());

        } else if (toggleButton().get(1).isSelected()) {
            accountInfoScene.getTotalAmount().setText(secondResult.toString());
        } else if (toggleButton().get(2).isSelected()) {
            accountInfoScene.getTotalAmount().setText(thirdResult.toString());
        }

    }
}
