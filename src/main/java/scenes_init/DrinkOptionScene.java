package scenes_init;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import options_components.DrinkOptionComponents;
import shopping_cart_textfields.*;
import textfields_formatters.InputAmountFieldsFormatter;


public class DrinkOptionScene {


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
    private Group group;
    private Scene scene;
    private Pane panel = new Pane();
    private Button backToMenu = new Button("BACK TO MENU");
    private DrinkTeaTextFields drinkTeaTextFields = new DrinkTeaTextFields();
    private DrinkColaTextFields drinkColaTextFields = new DrinkColaTextFields();
    private DrinkCoffeeTextFields drinkCoffeeTextFields = new DrinkCoffeeTextFields();
    private DrinkBeerTextFields drinkBeerTextFields = new DrinkBeerTextFields();
    private DrinkOptionComponents drinkOptionComponents = new DrinkOptionComponents();
    private DrinkJuiceTextFields drinkJuiceTextFields = new DrinkJuiceTextFields();
    private DrinkWaterTextFields drinkWaterTextFields = new DrinkWaterTextFields();
    private InputAmountFieldsFormatter inputAmountFieldsFormatter = new InputAmountFieldsFormatter();
    private Button addToShoppingCart = new Button("ADD ITEMS");

    public  TextField getFirst() {
        return first;
    }

    public  TextField getSecond() {
        return second;
    }

    public  TextField getFifth() {
        return fifth;
    }

    public  TextField getSeventh() {
        return seventh;
    }

    public  TextField getNinth() {
        return ninth;
    }

    public  TextField getEleventh() {
        return eleventh;
    }

    private void setTextFieldsProperties() {
        first.setLayoutX(45);
        first.setLayoutY(160);
        first.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        first.setPrefSize(35, 35);
        first.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        first.setText("0");

        second.setLayoutX(165);
        second.setLayoutY(160);
        second.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        second.setPrefSize(35, 35);
        second.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        second.setText("0");

        third.setLayoutX(95);
        third.setLayoutY(160);
        third.setText("99");
        third.setEditable(false);
        third.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        third.setPrefSize(35, 35);


        fourth.setLayoutX(215);
        fourth.setLayoutY(160);
        fourth.setText("99");
        fourth.setEditable(false);
        fourth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        fourth.setPrefSize(35, 35);

        fifth.setLayoutX(285);
        fifth.setLayoutY(160);
        fifth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        fifth.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        fifth.setPrefSize(35, 35);
        fifth.setText("0");

        sixth.setLayoutX(335);
        sixth.setLayoutY(160);
        sixth.setText("99");
        sixth.setEditable(false);
        sixth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        sixth.setPrefSize(35, 35);


        seventh.setLayoutX(395);
        seventh.setLayoutY(160);
        seventh.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        seventh.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        seventh.setPrefSize(35, 35);
        seventh.setText("0");

        eighth.setLayoutX(445);
        eighth.setLayoutY(160);
        eighth.setText("99");
        eighth.setEditable(false);
        eighth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        eighth.setPrefSize(35, 35);

        ninth.setLayoutX(525);
        ninth.setLayoutY(160);
        ninth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        ninth.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        ninth.setPrefSize(35, 35);
        ninth.setText("0");

        tenth.setLayoutX(575);
        tenth.setLayoutY(160);
        tenth.setText("99");
        tenth.setEditable(false);
        tenth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        tenth.setPrefSize(35, 35);

        eleventh.setLayoutX(645);
        eleventh.setLayoutY(160);
        eleventh.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        eleventh.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        eleventh.setPrefSize(35, 35);
        eleventh.setText("0");

        twelfth.setLayoutX(695);
        twelfth.setLayoutY(160);
        twelfth.setText("99");
        twelfth.setEditable(false);
        twelfth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        twelfth.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        twelfth.setPrefSize(35, 35);


    }

    private Pane getPanel() {
        panel.getChildren().addAll(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth);
        setTextFieldsProperties();
        return panel;
    }


    public void setAddItemsButtonListener() {
        addToShoppingCart.setOnAction(e -> {
            drinkColaTextFields.getColaAmount().setText(first.getText());
            drinkTeaTextFields.getTeaAmount().setText(second.getText());
            drinkCoffeeTextFields.getCoffeeAmount().setText(fifth.getText());
            drinkBeerTextFields.getBeerAmount().setText(seventh.getText());
            drinkJuiceTextFields.getJuiceAmount().setText(ninth.getText());
            drinkWaterTextFields.getWaterAmount().setText(eleventh.getText());
          /*  first.setText("0");
            second.setText("0");
            fifth.setText("0");
            seventh.setText("0");
            ninth.setText("0");
            eleventh.setText("0");*/


        });
    }

    private void setBackToMenuProparties() {
        backToMenu.setLayoutX(305);
        backToMenu.setLayoutY(500);
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
        if(scene == null){
            return scene = new Scene(group, 760, 650, Color.web("#ffc46b"));
        }else
            return scene;


    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getAddToShoppingCart(), getPanel(), getBackToMenu(), drinkOptionComponents.getBeerImageView(),
                drinkOptionComponents.getCoffeeImageView(), drinkOptionComponents.getColaImageView(), drinkOptionComponents.getJuiceImageView(),
                drinkOptionComponents.getTeaImageView(), drinkOptionComponents.getWaterImageView());
    }


}
