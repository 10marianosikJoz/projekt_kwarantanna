package scenes_init;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import options_components.FruitsOptionComponents;
import textfields_formatters.InputAmountFieldsFormatter;
import textfields_formatters.TransferBankFieldsFormatter;

import java.util.ArrayList;


public class FruitOptionScene {
    private static ArrayList<TextField> textFieldsAmountFruits = new ArrayList<>();
    //    private static Button sendTransfer = new Button("SEND");
    private Group group;
    private Scene scene;
    private Button backToMenu = new Button("BACK TO MENU");
    private Pane panel = new Pane();
    private TransferBankFieldsFormatter transferBankFieldsFormatters = new TransferBankFieldsFormatter();
    private FruitsOptionComponents fruitsOptionComponents = new FruitsOptionComponents();
    private InputAmountFieldsFormatter amountFieldsFormatter = new InputAmountFieldsFormatter();

    private void addTextFieldsToList() {
        for (int i = 0; i < 12; i++) {
            textFieldsAmountFruits.add(new TextField());
        }
    }

    private void setTextFieldsPreferredSizes() {
        for (TextField textField : textFieldsAmountFruits) {
            textField.setPrefSize(35, 35);
        }
    }

    private void setPromptTextsToFields() {
        for (TextField textField : textFieldsAmountFruits) {
            textField.setAlignment(Pos.CENTER);
        }
       /* textFields.get(0).setPromptText("Amount");
        textFields.get(1).setPromptText("Amount");
        textFields.get(2).setPromptText("Amount");
        textFields.get(3).setPromptText("Amount");
        textFields.get(4).setPromptText("Amount");
        textFields.get(5).setPromptText("Amount");*/

    }

    private void setTextFieldsProperties() {
        textFieldsAmountFruits.get(0).setLayoutX(35);
        textFieldsAmountFruits.get(0).setLayoutY(160);
        textFieldsAmountFruits.get(0).setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountFruits.get(1).setLayoutX(165);
        textFieldsAmountFruits.get(1).setLayoutY(160);
        textFieldsAmountFruits.get(1).setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountFruits.get(2).setLayoutX(295);
        textFieldsAmountFruits.get(2).setLayoutY(160);
        textFieldsAmountFruits.get(2).setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountFruits.get(3).setLayoutX(425);
        textFieldsAmountFruits.get(3).setLayoutY(160);
        textFieldsAmountFruits.get(3).setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountFruits.get(4).setLayoutX(570);
        textFieldsAmountFruits.get(4).setLayoutY(160);
        textFieldsAmountFruits.get(4).setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountFruits.get(5).setLayoutX(700);
        textFieldsAmountFruits.get(5).setLayoutY(160);
        textFieldsAmountFruits.get(5).setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountFruits.get(6).setLayoutX(85);
        textFieldsAmountFruits.get(6).setLayoutY(160);
        textFieldsAmountFruits.get(6).setText("30");
        textFieldsAmountFruits.get(6).setEditable(false);
        textFieldsAmountFruits.get(6).setFont(Font.font("Verdana", FontWeight.BOLD, 12));

        textFieldsAmountFruits.get(7).setLayoutX(215);
        textFieldsAmountFruits.get(7).setLayoutY(160);
        textFieldsAmountFruits.get(7).setText("30");
        textFieldsAmountFruits.get(7).setEditable(false);
        textFieldsAmountFruits.get(7).setFont(Font.font("Verdana", FontWeight.BOLD, 12));

        textFieldsAmountFruits.get(8).setLayoutX(345);
        textFieldsAmountFruits.get(8).setLayoutY(160);
        textFieldsAmountFruits.get(8).setText("30");
        textFieldsAmountFruits.get(8).setEditable(false);
        textFieldsAmountFruits.get(8).setFont(Font.font("Verdana", FontWeight.BOLD, 12));


        textFieldsAmountFruits.get(9).setLayoutX(475);
        textFieldsAmountFruits.get(9).setLayoutY(160);
        textFieldsAmountFruits.get(9).setText("30");
        textFieldsAmountFruits.get(9).setEditable(false);
        textFieldsAmountFruits.get(9).setFont(Font.font("Verdana", FontWeight.BOLD, 12));


        textFieldsAmountFruits.get(10).setLayoutX(620);
        textFieldsAmountFruits.get(10).setLayoutY(160);
        textFieldsAmountFruits.get(10).setText("30");
        textFieldsAmountFruits.get(10).setEditable(false);
        textFieldsAmountFruits.get(10).setFont(Font.font("Verdana", FontWeight.BOLD, 12));


        textFieldsAmountFruits.get(11).setLayoutX(750);
        textFieldsAmountFruits.get(11).setLayoutY(160);
        textFieldsAmountFruits.get(11).setText("30");
        textFieldsAmountFruits.get(11).setEditable(false);
        textFieldsAmountFruits.get(11).setFont(Font.font("Verdana", FontWeight.BOLD, 12));



    }

    private Pane getPanel() {
        addTextFieldsToList();
        for (TextField textField : textFieldsAmountFruits) {
            panel.getChildren().addAll(textField);
        }
       /* numberFieldValidation();
        amountFieldValidation();
        buttonHandler();*/
        setPromptTextsToFields();
        setTextFieldsProperties();
        setTextFieldsPreferredSizes();
        return panel;
    }


    public ArrayList<TextField> getTextFields() {
        return textFieldsAmountFruits;
    }


   /* private void buttonHandler() {
        for (TextField textField : textFields) {
            textField.textProperty().addListener((observableValue, s, t1) -> {

                if (textFields.get(0).getText().isEmpty() || textFields.get(1).getText().isEmpty() || textFields.get(2).getText().isEmpty() || textFields.get(3).getText().isEmpty() || textFields.get(4).getText().isEmpty()) {
                    getSendTransfer().setDisable(true);
                } else {
                    sendTransfer.setDisable(false);
                }

            });
        }
    }*/

    /*private void amountFieldValidation() {
        textFields.get(3).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d{0,7}([.]\\d{0,4})?")) {
                textFields.get(3).setText(s);
                getSendTransfer().setDisable(true);
            } else {
                getSendTransfer().setDisable(false);
            }
        });
    }

    private void numberFieldValidation() {
        textFields.get(4).textProperty().addListener((observableValue, s, t1) -> {
            if (!t1.matches("\\d*")) {
                textFields.get(4).setText(s);
                getSendTransfer().setDisable(true);
            } else {
                getSendTransfer().setDisable(false);
            }
        });
    }*/

    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(400);
        backToMenu.setLayoutY(500);
        backToMenu.setStyle("-fx-background-color: #7E807F; ");
        backToMenu.setPrefSize(120, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);
    }


    public Button getBackToMenu() {
        setBackToMenuProparties();
        return backToMenu;
    }


    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        return scene = new Scene(group, 835, 650, Color.web("#ffc46b"));
    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPanel(), getBackToMenu(), fruitsOptionComponents.getBananImageView(),fruitsOptionComponents.getAppleImageView(),fruitsOptionComponents.getKiwiImageView(),
                fruitsOptionComponents.getPearImageView(),fruitsOptionComponents.getPlumImageView(),fruitsOptionComponents.getStrawberryImageView());
    }


}

