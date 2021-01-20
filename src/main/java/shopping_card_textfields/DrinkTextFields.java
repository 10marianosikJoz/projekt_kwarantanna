package shopping_card_textfields;

import get_final_price_from_items.ShoppingCartColaOperations;
import get_final_price_from_items.ShoppingCartFinalPrice;
import get_final_price_from_items.ShoppingCartTeaOperations;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DrinkTextFields {
    public static javafx.scene.control.TextField colaAmount = new javafx.scene.control.TextField();
    public static javafx.scene.control.TextField colaPrice = new javafx.scene.control.TextField();
    public static javafx.scene.control.TextField colaTotalSum = new javafx.scene.control.TextField();
    public static javafx.scene.control.TextField teaAmount = new javafx.scene.control.TextField();
    public static javafx.scene.control.TextField teaPrice = new javafx.scene.control.TextField();
    public static javafx.scene.control.TextField teaTotalSum = new javafx.scene.control.TextField();
    private static TextField totalSumOfAllItems = new TextField();
    public static Button finalResult = new Button("Summary");
    private static ShoppingCartColaOperations shoppingCartColaOperations = new ShoppingCartColaOperations();
    private static ShoppingCartTeaOperations shoppingCartTeaOperations = new ShoppingCartTeaOperations();
    private static ShoppingCartFinalPrice shoppingCartFinalPrice = new ShoppingCartFinalPrice();

    public void setFinalResultButtonListener(){
        finalResult.setOnAction(e ->{
            getTotalSum().setText(shoppingCartColaOperations.getColaFinalPrice().toString());
            getTeaTotalSum().setText(shoppingCartTeaOperations.getTeaFinalPrice().toString());
            getTotalSumOfAllItems().setText(shoppingCartFinalPrice.getTotalPrice().toString());

        });
    }

    public  TextField getTotalSumOfAllItems() {
        return totalSumOfAllItems;
    }

    public void setFinalResultButtonProperties(){
        setFinalResultButtonListener();
        finalResult.setLayoutX(350);
        finalResult.setLayoutY(450);
    }

    public  Button getFinalResult() {
        setFinalResultButtonProperties();
        return finalResult;
    }

    public void setAmountTextFieldProperties() {
        colaAmount.setLayoutX(50);
        colaAmount.setLayoutY(20);
        colaAmount.setEditable(false);
        colaAmount.setPrefSize(50,50);
    }

    public void setPriceTextFieldProperties() {
        colaPrice.setLayoutX(100);
        colaPrice.setLayoutY(20);
        colaPrice.setText("2.50");
        colaPrice.setEditable(false);
        colaPrice.setPrefSize(50,50);
    }

    public  void setTotalSumTextFieldProperties() {
        colaTotalSum.setLayoutX(150);
        colaTotalSum.setLayoutY(20);
        colaTotalSum.setEditable(false);
        colaTotalSum.setPrefSize(50,50);
    }

    public TextField getAmount() {
        setAmountTextFieldProperties();
        return colaAmount;
    }

    public TextField getPrice() {
        setPriceTextFieldProperties();
        return colaPrice;
    }

    public TextField getTotalSum() {
        setTotalSumTextFieldProperties();
        return colaTotalSum;
    }

    public void setTeaAmountTextFieldProperties() {
        teaAmount.setLayoutX(50);
        teaAmount.setLayoutY(80);
        teaAmount.setEditable(false);
        teaAmount.setPrefSize(50,50);
    }

    public void setTeaPriceTextFieldProperties() {
        teaPrice.setLayoutX(100);
        teaPrice.setLayoutY(80);
        teaPrice.setText("2.50");
        teaPrice.setEditable(false);
        teaPrice.setPrefSize(50,50);
    }

    public  void setTeaTotalSumTextFieldProperties() {
        teaTotalSum.setLayoutX(150);
        teaTotalSum.setLayoutY(80);
        teaTotalSum.setEditable(false);
        teaTotalSum.setPrefSize(50,50);
    }


    public  TextField getTeaAmount() {
        setTeaAmountTextFieldProperties();
        return teaAmount;
    }

    public  TextField getTeaPrice() {
        setTeaPriceTextFieldProperties();
        return teaPrice;
    }

    public TextField getTeaTotalSum() {
        setTeaTotalSumTextFieldProperties();
        return teaTotalSum;
    }
}
