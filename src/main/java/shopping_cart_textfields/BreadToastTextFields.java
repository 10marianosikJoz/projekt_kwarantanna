package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.BreadOptionScene;

public class BreadToastTextFields {

    public static TextField toastAmount = new TextField();
    public static TextField toastPrice = new TextField();
    public static TextField toastTotalSum = new TextField();
    private static BreadOptionScene breadOptionScene = new BreadOptionScene();

    public void setToastAmountTextFieldProperties() {
        toastAmount.setLayoutX(380);
        toastAmount.setLayoutY(480);
        toastAmount.setEditable(false);
        toastAmount.setAlignment(Pos.CENTER);
        toastAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        toastAmount.setPrefSize(50,50);
        toastAmount.setText(breadOptionScene.getEleventh().getText());

    }

    public void setToastPriceTextFieldProperties() {
        toastPrice.setLayoutX(450);
        toastPrice.setLayoutY(480);
        toastPrice.setText("2.50");
        toastPrice.setEditable(false);
        toastPrice.setAlignment(Pos.CENTER);
        toastPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        toastPrice.setPrefSize(50,50);

    }

    public  void setToastTotalSumTextFieldProperties() {
        toastTotalSum.setLayoutX(520);
        toastTotalSum.setLayoutY(480);
        toastTotalSum.setEditable(false);
        toastTotalSum.setAlignment(Pos.CENTER);
        toastTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        toastTotalSum.setPrefSize(80,50);
    }

    public  TextField getToastAmount() {
        setToastAmountTextFieldProperties();
        return toastAmount;
    }

    public  TextField getToastPrice() {
        setToastPriceTextFieldProperties();
        return toastPrice;
    }

    public  TextField getToastTotalSum() {
        setToastTotalSumTextFieldProperties();
        return toastTotalSum;
    }
}
