package scenes_init;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import lombok.Getter;
import options_components.BreadOptionComponents;
import options_components.DrinkOptionComponents;
import shopping_cart_textfields.*;
import textfields_formatters.InputAmountFieldsFormatter;

public class BreadOptionScene {


    private Group group;
    private Scene scene;
    private Pane panel = new Pane();
    private Button backToMenu = new Button("BACK TO MENU");
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
    private Button addToShoppingCart = new Button("ADD ITEMS");
    private BreadBaguetteTextFields breadBaguetteTextFields = new BreadBaguetteTextFields();
    private BreadTextFields breadTextFields = new BreadTextFields();
    private BreadCroissantTextFields breadCroissantTextFields = new BreadCroissantTextFields();
    private BreadRollBreadTextFields breadRollBreadTextFields = new BreadRollBreadTextFields();
    private BreadRollTextFields breadRollTextFields = new BreadRollTextFields();
    private BreadToastTextFields breadToastTextFields = new BreadToastTextFields();
    private InputAmountFieldsFormatter inputAmountFieldsFormatter = new InputAmountFieldsFormatter();


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

    public  TextField getNinth() {
        return ninth;
    }

    public TextField getEleventh() {
        return eleventh;
    }

    private BreadOptionComponents breadOptionComponents = new BreadOptionComponents();

    private void setBackToMenuButtonProparties() {
        backToMenu.setLayoutX(350);
        backToMenu.setLayoutY(500);
        backToMenu.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22  ");
        backToMenu.setPrefSize(150, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);
    }

    public Button getBackToMenuButton() {
        setBackToMenuButtonProparties();
        return backToMenu;
    }

    private void setAddToShoppingCartButtonProparties() {
        addToShoppingCart.setLayoutX(350);
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

    public void setAddItemsButtonListener() {
        addToShoppingCart.setOnAction(e -> {
            breadBaguetteTextFields.getBaguetteAmount().setText(first.getText());
            breadTextFields.getBreadAmount().setText(third.getText());
            breadCroissantTextFields.getCroissantAmount().setText(fifth.getText());
            breadRollBreadTextFields.getRollBreadAmount().setText(seventh.getText());
            breadRollTextFields.getRollAmount().setText(ninth.getText());
            breadToastTextFields.getToastAmount().setText(eleventh.getText());

        });
    }


    private void setTextFieldsProperties() {
        first.setLayoutX(35);
        first.setLayoutY(160);
        first.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        first.setPrefSize(35, 35);
        first.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        first.setText("0");

        second.setLayoutX(85);
        second.setLayoutY(160);
        second.setPrefSize(35, 35);
        second.setEditable(false);
        second.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        second.setText("99");

        third.setLayoutX(150);
        third.setLayoutY(160);
        third.setText("0");
        third.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        third.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        third.setPrefSize(35, 35);


        fourth.setLayoutX(200);
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


        seventh.setLayoutX(445);
        seventh.setLayoutY(160);
        seventh.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        seventh.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        seventh.setPrefSize(35, 35);
        seventh.setText("0");

        eighth.setLayoutX(495);
        eighth.setLayoutY(160);
        eighth.setText("99");
        eighth.setEditable(false);
        eighth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        eighth.setPrefSize(35, 35);

        ninth.setLayoutX(585);
        ninth.setLayoutY(160);
        ninth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        ninth.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        ninth.setPrefSize(35, 35);
        ninth.setText("0");

        tenth.setLayoutX(635);
        tenth.setLayoutY(160);
        tenth.setText("99");
        tenth.setEditable(false);
        tenth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        tenth.setPrefSize(35, 35);

        eleventh.setLayoutX(725);
        eleventh.setLayoutY(160);
        eleventh.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        eleventh.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        eleventh.setPrefSize(35, 35);
        eleventh.setText("0");

        twelfth.setLayoutX(775);
        twelfth.setLayoutY(160);
        twelfth.setText("99");
        twelfth.setEditable(false);
        twelfth.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        twelfth.setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());
        twelfth.setPrefSize(35, 35);



    }

    private Pane getPanel() {
        panel.getChildren().addAll(first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth);
        setTextFieldsProperties();
        return panel;
    }


    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        if(scene == null){
            return scene = new Scene(group, 850, 650, Color.web("#ffc46b"));
        }else
            return scene;


    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getAddToShoppingCart(),getPanel(), getBackToMenuButton(), breadOptionComponents.getBaguetteImageView(),
                breadOptionComponents.getCroissantImageView(), breadOptionComponents.getRollBreadImageView(),
                breadOptionComponents.getBreadImageView(), breadOptionComponents.getRollsImageView(), breadOptionComponents.getToastImageView());
    }
}

