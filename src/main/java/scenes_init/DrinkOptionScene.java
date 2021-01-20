package scenes_init;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import options_components.DrinkOptionComponents;
import shopping_card_textfields.DrinkTextFields;
import textfields_formatters.InputAmountFieldsFormatter;

import java.util.ArrayList;

public class DrinkOptionScene {

    private Group group;
    private Scene scene;
    private Pane panel = new Pane();
    private Button backToMenu = new Button("BACK TO MENU");
    private static TextField first = new TextField();
    private static TextField second = new TextField();
    private static TextField third = new TextField();
    private static TextField fourth = new TextField();
    private static ArrayList<TextField> textFieldsAmountDrink = new ArrayList<>();
    private DrinkOptionComponents drinkOptionComponents = new DrinkOptionComponents();
    private InputAmountFieldsFormatter inputAmountFieldsFormatter = new InputAmountFieldsFormatter();
    private Button addToShoppingCart = new Button("ADD ITEMS");
    DrinkTextFields drinkTextFields =  new DrinkTextFields();



    private void setTextFieldsProperties(){
        first.setLayoutX(45);
        first.setLayoutY(160);
        first.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        first.setPrefSize(35,35);
        first.setText("0");

        second.setLayoutX(165);
        second.setLayoutY(160);
        second.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        second.setPrefSize(35,35);
        second.setText("0");

        third.setLayoutX(95);
        third.setLayoutY(160);
        third.setText("30");
        third.setEditable(false);
        third.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        third.setPrefSize(35,35);


        fourth.setLayoutX(215);
        fourth.setLayoutY(160);
        fourth.setText("30");
        fourth.setEditable(false);
        fourth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        fourth.setPrefSize(35,35);

    }

    private void addTextFieldsToList() {
        for (int i = 0; i < 12; i++) {
            textFieldsAmountDrink.add(new TextField());
        }
    }

    private void setTextFieldsPreferredSizes() {
        for (TextField textField : textFieldsAmountDrink) {
            textField.setPrefSize(35, 35);
        }
    }





    private Pane getPanel() {
        panel.getChildren().addAll(first,second,third,fourth);
        setTextFieldsProperties();
        setTextFieldsPreferredSizes();
        return panel;
    }


    public void setAddItemsButtonListener(){
        addToShoppingCart.setOnAction(e ->{
            drinkTextFields.getAmount().setText(first.getText());
            drinkTextFields.getTeaAmount().setText(second.getText());
        });
    }


 /*   private void buttonHandler() {

        for (TextField amountField : amountFields) {
            amountField.textProperty().addListener((observableValue, s, t1) -> {

                if ((getFirstText().isEmpty() || getSecondText().isEmpty() || getThirdText().isEmpty())) {
                    topYourAccount.setDisable(true);
                } else {
                    topYourAccount.setDisable(false);

                }

            });
        }
    }*/

/*    private void textFieldAmountValidation() {
        amountFields.get(0).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                amountFields.get(0).setText(s);
                topYourAccount.setDisable(true);
            } else {
                topYourAccount.setDisable(false);
            }
        });
    }

    private void textFieldNumberValidation() {
        amountFields.get(1).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d*")) {
                amountFields.get(1).setText(s);
                topYourAccount.setDisable(true);
            } else {
                topYourAccount.setDisable(false);
            }
        });
    }*/

    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(305);
        backToMenu.setLayoutY(550);
        backToMenu.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22 ");
        backToMenu.setPrefSize(150, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);
    }

    public Button getBackToMenu() {
        setBackToMenuProparties();
        return backToMenu;
    }

    private void setAddToShoppingCartButtonProparties() {
        addToShoppingCart.setLayoutX(305);
        addToShoppingCart.setLayoutY(450);
        addToShoppingCart.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22 ");
        addToShoppingCart.setPrefSize(150, 35);
        addToShoppingCart.setTextFill(Color.WHITE);
        addToShoppingCart.setDisable(false);
    }

    public Button getAddToShoppingCart() {
        setAddItemsButtonListener();
        setAddToShoppingCartButtonProparties();
        return addToShoppingCart;
    }

    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        return scene = new Scene(group, 760, 650, Color.web("#ffc46b"));
    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getAddToShoppingCart(),getPanel(),getBackToMenu(),drinkOptionComponents.getBeerImageView(),
                drinkOptionComponents.getCoffeeImageView(),drinkOptionComponents.getColaImageView(),drinkOptionComponents.getJuiceImageView(),
                drinkOptionComponents.getTeaImageView(),drinkOptionComponents.getWaterImageView());
    }


}
