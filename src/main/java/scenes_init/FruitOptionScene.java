package scenes_init;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import options_components.FruitsOptionComponents;
import textfields_formatters.TransferBankFieldsFormatter;

import java.util.ArrayList;


public class FruitOptionScene {
    private static ArrayList<TextField> textFields = new ArrayList<>(5);
    //    private static Button sendTransfer = new Button("SEND");
    private Group group;
    private Scene scene;
    private Button backToMenu = new Button("Dodaj do koszyka");
    private Pane panel = new Pane();
    private TransferBankFieldsFormatter transferBankFieldsFormatters = new TransferBankFieldsFormatter();
    private FruitsOptionComponents fruitsOptionComponents = new FruitsOptionComponents();

    private void addTextFieldsToList() {
        for (int i = 0; i < 12; i++) {
            textFields.add(new TextField());
        }
    }

    private void setTextFieldsPreferredSizes() {
        for (TextField textField : textFields) {
            textField.setPrefSize(60, 60);
        }
    }

    private void setPromptTextsToFields() {
        for (TextField textField : textFields) {
            textField.setAlignment(Pos.CENTER);
        }
        textFields.get(0).setPromptText("Amount");
        textFields.get(1).setPromptText("Amount");
        textFields.get(2).setPromptText("Amount");
        textFields.get(3).setPromptText("Amount");
        textFields.get(4).setPromptText("Amount");
        textFields.get(5).setPromptText("Amount");

    }

    private void setTextFieldsProperties() {
        textFields.get(0).setLayoutX(175);
        textFields.get(0).setLayoutY(20);
        textFields.get(0).setTextFormatter(transferBankFieldsFormatters.getNameFormatter());

        textFields.get(1).setLayoutX(175);
        textFields.get(1).setLayoutY(150);
        textFields.get(1).setTextFormatter(transferBankFieldsFormatters.getSurnameFormatter());

        textFields.get(2).setLayoutX(175);
        textFields.get(2).setLayoutY(250);
        textFields.get(2).setTextFormatter(transferBankFieldsFormatters.getAddressFormatter());

        textFields.get(3).setLayoutX(175);
        textFields.get(3).setLayoutY(370);
        textFields.get(3).setTextFormatter(transferBankFieldsFormatters.getNameFormatter());

        textFields.get(4).setLayoutX(175);
        textFields.get(4).setLayoutY(470);
        textFields.get(4).setTextFormatter(transferBankFieldsFormatters.getSurnameFormatter());

        textFields.get(5).setLayoutX(175);
        textFields.get(5).setLayoutY(600);
        textFields.get(5).setTextFormatter(transferBankFieldsFormatters.getAddressFormatter());

        textFields.get(6).setLayoutX(270);
        textFields.get(6).setLayoutY(20);

        textFields.get(7).setLayoutX(270);
        textFields.get(7).setLayoutY(150);


        textFields.get(8).setLayoutX(270);
        textFields.get(8).setLayoutY(250);


        textFields.get(9).setLayoutX(270);
        textFields.get(9).setLayoutY(370);


        textFields.get(10).setLayoutX(270);
        textFields.get(10).setLayoutY(470);


        textFields.get(11).setLayoutX(270);
        textFields.get(11).setLayoutY(600);


    }

    private Pane getPanel() {
        addTextFieldsToList();
        for (TextField textField : textFields) {
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
        return textFields;
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
        backToMenu.setLayoutY(560);
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
        return scene = new Scene(group, 700, 750, Color.web("#ffc46b"));
    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPanel(), getBackToMenu(), fruitsOptionComponents.getBananImageView(),fruitsOptionComponents.getAppleImageView(),fruitsOptionComponents.getKiwiImageView(),
                fruitsOptionComponents.getPearImageView(),fruitsOptionComponents.getPlumImageView(),fruitsOptionComponents.getStrawberryImageView());
    }


}

