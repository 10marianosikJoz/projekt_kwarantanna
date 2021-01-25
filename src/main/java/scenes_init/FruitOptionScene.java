package scenes_init;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import options_components.FruitsOptionComponents;
import shopping_cart_textfields.*;
import textfields_formatters.InputAmountFieldsFormatter;
import textfields_formatters.TransferBankFieldsFormatter;

import java.util.ArrayList;


public class FruitOptionScene {
    private Group group;
    private Scene scene;
    private Pane panel = new Pane();
    private static TextField first = new TextField();
    private static TextField second = new TextField();
    private static TextField third = new TextField();
    private static TextField fourth = new TextField();
    private static TextField fifth = new TextField();
    private static TextField sixth = new TextField();
    private static TextField seventh = new TextField();
    private static TextField eighth = new TextField();
    private static TextField ninth = new TextField();
    private static TextField tenth = new TextField();
    private static TextField eleventh = new TextField();
    private static TextField twelfth = new TextField();
    private Button backToMenu = new Button("BACK TO MENU");
    private Button addToShoppingCart = new Button("ADD ITEMS");
    private FruitsOptionComponents fruitsOptionComponents = new FruitsOptionComponents();
    private FruitPlumTextFields fruitPlumTextFields = new FruitPlumTextFields();
    private FruitPearTextFields fruitPearTextFields = new FruitPearTextFields();
    private FruitAppleTextFields fruitAppleTextFields = new FruitAppleTextFields();
    private FruitKiwiTextFields fruitKiwiTextFields = new FruitKiwiTextFields();
    private FruitStrawberryTextFields fruitStrawberryTextFields = new FruitStrawberryTextFields();
    private FruitBananaTextFields fruitBananaTextFields = new FruitBananaTextFields();
    private InputAmountFieldsFormatter amountFieldsFormatter = new InputAmountFieldsFormatter();

    public TextField getFirst() {
        return first;
    }

    public TextField getThird() {
        return third;
    }

    public TextField getFifth() {
        return fifth;
    }

    public TextField getSeventh() {
        return seventh;
    }

    public TextField getNinth() {
        return ninth;
    }

    public TextField getEleventh() {
        return eleventh;
    }

    private void setTextFieldsProperties() {
        first.setLayoutX(35);
        first.setLayoutY(160);
        first.setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());
        first.setPrefSize(35, 35);
        first.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        first.setText("0");

        second.setLayoutX(90);
        second.setLayoutY(160);
        second.setPrefSize(35, 35);
        second.setEditable(false);
        second.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        second.setText("99");

        third.setLayoutX(165);
        third.setLayoutY(160);
        third.setText("0");
        third.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        third.setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());
        third.setPrefSize(35, 35);


        fourth.setLayoutX(220);
        fourth.setLayoutY(160);
        fourth.setText("99");
        fourth.setEditable(false);
        fourth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        fourth.setPrefSize(35, 35);

        fifth.setLayoutX(295);
        fifth.setLayoutY(160);
        fifth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        fifth.setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());
        fifth.setPrefSize(35, 35);
        fifth.setText("0");

        sixth.setLayoutX(345);
        sixth.setLayoutY(160);
        sixth.setText("99");
        sixth.setEditable(false);
        sixth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        sixth.setPrefSize(35, 35);


        seventh.setLayoutX(420);
        seventh.setLayoutY(160);
        seventh.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        seventh.setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());
        seventh.setPrefSize(35, 35);
        seventh.setText("0");

        eighth.setLayoutX(475);
        eighth.setLayoutY(160);
        eighth.setText("99");
        eighth.setEditable(false);
        eighth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        eighth.setPrefSize(35, 35);

        ninth.setLayoutX(575);
        ninth.setLayoutY(160);
        ninth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        ninth.setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());
        ninth.setPrefSize(35, 35);
        ninth.setText("0");

        tenth.setLayoutX(630);
        tenth.setLayoutY(160);
        tenth.setText("99");
        tenth.setEditable(false);
        tenth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        tenth.setPrefSize(35, 35);

        eleventh.setLayoutX(705);
        eleventh.setLayoutY(160);
        eleventh.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        eleventh.setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());
        eleventh.setPrefSize(35, 35);
        eleventh.setText("0");

        twelfth.setLayoutX(760);
        twelfth.setLayoutY(160);
        twelfth.setText("99");
        twelfth.setEditable(false);
        twelfth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        twelfth.setTextFormatter(amountFieldsFormatter.getAmountNumberFormatter());
        twelfth.setPrefSize(35, 35);
    }

    private Pane getPanel() {
       panel.getChildren().addAll(first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth);
       setTextFieldsProperties();
       return panel;
    }


    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(342.5);
        backToMenu.setLayoutY(500);
        backToMenu.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22 ");
        backToMenu.setPrefSize(150, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);
    }
    public void setAddItemsButtonListener() {
        addToShoppingCart.setOnAction(e -> {
           fruitPlumTextFields.getPlumAmount().setText(first.getText());
            fruitPearTextFields.getPearAmount().setText(third.getText());
            fruitAppleTextFields.getAppleAmount().setText(fifth.getText());
            fruitKiwiTextFields.getKiwiAmount().setText(seventh.getText());
            fruitStrawberryTextFields.getStrawberryAmount().setText(ninth.getText());
            fruitBananaTextFields.getBananaAmount().setText(eleventh.getText());
        /*    first.setText("0");
            third.setText("0");
            fifth.setText("0");
            seventh.setText("0");
            ninth.setText("0");
            eleventh.setText("0");*/

        });
    }
    private void setAddToShoppingCartButtonProparties() {
        addToShoppingCart.setLayoutX(342.5);
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


    public Button getBackToMenu() {
        setBackToMenuProparties();
        return backToMenu;
    }


    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        if(scene == null){
            return scene = new Scene(group, 835, 650, Color.web("#ffc46b"));
        }else
            return scene;


    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getAddToShoppingCart(),getPanel(), getBackToMenu(), fruitsOptionComponents.getBananImageView(),fruitsOptionComponents.getAppleImageView(),fruitsOptionComponents.getKiwiImageView(),
                fruitsOptionComponents.getPearImageView(),fruitsOptionComponents.getPlumImageView(),fruitsOptionComponents.getStrawberryImageView());
    }


}

