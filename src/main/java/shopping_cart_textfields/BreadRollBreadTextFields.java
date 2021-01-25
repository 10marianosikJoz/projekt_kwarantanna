package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.BreadOptionScene;

public class BreadRollBreadTextFields {

    public static TextField rollBreadAmount = new TextField();
    public static TextField rollBreadPrice = new TextField();
    public static TextField rollBreadTotalSum = new TextField();
    private static BreadOptionScene breadOptionScene = new BreadOptionScene();

    public void setRollBreadAmountTextFieldProperties() {
        rollBreadAmount.setLayoutX(380);
        rollBreadAmount.setLayoutY(320);
        rollBreadAmount.setEditable(false);
        rollBreadAmount.setAlignment(Pos.CENTER);
        rollBreadAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        rollBreadAmount.setPrefSize(50,50);
        rollBreadAmount.setText(breadOptionScene.getSeventh().getText());


    }

    public void setRollBreadPriceTextFieldProperties() {
        rollBreadPrice.setLayoutX(450);
        rollBreadPrice.setLayoutY(320);
        rollBreadPrice.setText("2.50");
        rollBreadPrice.setEditable(false);
        rollBreadPrice.setAlignment(Pos.CENTER);
        rollBreadPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        rollBreadPrice.setPrefSize(50,50);

    }

    public  void setRollBreadTotalSumTextFieldProperties() {
        rollBreadTotalSum.setLayoutX(520);
        rollBreadTotalSum.setLayoutY(320);
        rollBreadTotalSum.setEditable(false);
        rollBreadTotalSum.setAlignment(Pos.CENTER);
        rollBreadTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        rollBreadTotalSum.setPrefSize(80,50);

    }

    public  TextField getRollBreadAmount() {
        setRollBreadAmountTextFieldProperties();
        return rollBreadAmount;
    }

    public  TextField getRollBreadPrice() {
        setRollBreadPriceTextFieldProperties();
        return rollBreadPrice;
    }

    public  TextField getRollBreadTotalSum() {
        setRollBreadTotalSumTextFieldProperties();
        return rollBreadTotalSum;
    }
}
