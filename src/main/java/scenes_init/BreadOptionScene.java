package scenes_init;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import options_components.BreadOptionComponents;
import textfields_formatters.InputAmountFieldsFormatter;

import java.util.ArrayList;

public class BreadOptionScene {


    private Group group;
    private Scene scene;
    private Pane panel = new Pane();
    private Button backToMenu = new Button("BACK TO MENU");
    private ArrayList<TextField> textFieldsAmountBread = new ArrayList<>();
    private InputAmountFieldsFormatter inputAmountFieldsFormatter = new InputAmountFieldsFormatter();
    static TextField dupa = new TextField();
//    private static Button buyTicketButton = new Button("BUY");

    private BreadOptionComponents breadOptionComponents = new BreadOptionComponents();

    private void setBackToMenuButtonProparties() {
        backToMenu.setLayoutX(350);
        backToMenu.setLayoutY(550);
        backToMenu.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22  ");
        backToMenu.setPrefSize(150, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);

    }



    public Button getBackToMenuButton() {
        setBackToMenuButtonProparties();
        return backToMenu;
    }
    private void addTextFieldsToList() {
        for (int i = 0; i < 12; i++) {
            textFieldsAmountBread.add(new TextField());
        }
    }

    private void setTextFieldsPreferredSizes() {
        for (TextField textField : textFieldsAmountBread) {
            textField.setPrefSize(35, 35);
        }
    }

    private void setTextFieldsProperties() {
        textFieldsAmountBread.get(0).setLayoutX(35);
        textFieldsAmountBread.get(0).setLayoutY(160);
        textFieldsAmountBread.get(0).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountBread.get(1).setLayoutX(165);
        textFieldsAmountBread.get(1).setLayoutY(160);
        textFieldsAmountBread.get(1).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountBread.get(2).setLayoutX(285);
        textFieldsAmountBread.get(2).setLayoutY(160);
        textFieldsAmountBread.get(2).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountBread.get(3).setLayoutX(435);
        textFieldsAmountBread.get(3).setLayoutY(160);
        textFieldsAmountBread.get(3).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountBread.get(4).setLayoutX(585);
        textFieldsAmountBread.get(4).setLayoutY(160);
        textFieldsAmountBread.get(4).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountBread.get(5).setLayoutX(725);
        textFieldsAmountBread.get(5).setLayoutY(160);
        textFieldsAmountBread.get(5).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountBread.get(6).setLayoutX(85);
        textFieldsAmountBread.get(6).setLayoutY(160);
        textFieldsAmountBread.get(6).setText("30");
        textFieldsAmountBread.get(6).setEditable(false);
        textFieldsAmountBread.get(6).setFont(Font.font("Verdana", FontWeight.BOLD, 12));

        textFieldsAmountBread.get(7).setLayoutX(215);
        textFieldsAmountBread.get(7).setLayoutY(160);
        textFieldsAmountBread.get(7).setText("30");
        textFieldsAmountBread.get(7).setEditable(false);
        textFieldsAmountBread.get(7).setFont(Font.font("Verdana", FontWeight.BOLD, 12));

        textFieldsAmountBread.get(8).setLayoutX(335);
        textFieldsAmountBread.get(8).setLayoutY(160);
        textFieldsAmountBread.get(8).setText("30");
        textFieldsAmountBread.get(8).setEditable(false);
        textFieldsAmountBread.get(8).setFont(Font.font("Verdana", FontWeight.BOLD, 12));


        textFieldsAmountBread.get(9).setLayoutX(485);
        textFieldsAmountBread.get(9).setLayoutY(160);
        textFieldsAmountBread.get(9).setText("30");
        textFieldsAmountBread.get(9).setEditable(false);
        textFieldsAmountBread.get(9).setFont(Font.font("Verdana", FontWeight.BOLD, 12));


        textFieldsAmountBread.get(10).setLayoutX(635);
        textFieldsAmountBread.get(10).setLayoutY(160);
        textFieldsAmountBread.get(10).setText("30");
        textFieldsAmountBread.get(10).setEditable(false);
        textFieldsAmountBread.get(10).setFont(Font.font("Verdana", FontWeight.BOLD, 12));


        textFieldsAmountBread.get(11).setLayoutX(775);
        textFieldsAmountBread.get(11).setLayoutY(160);
        textFieldsAmountBread.get(11).setText("30");
        textFieldsAmountBread.get(11).setEditable(false);
        textFieldsAmountBread.get(11).setFont(Font.font("Verdana", FontWeight.BOLD, 12));



    }

    private Pane getPanel() {
        addTextFieldsToList();
        for (TextField textField : textFieldsAmountBread) {
            panel.getChildren().addAll(textField);
        }
       /* numberFieldValidation();
        amountFieldValidation();
        buttonHandler();*/
        setTextFieldsProperties();
        setTextFieldsPreferredSizes();
        return panel;
    }


    public ArrayList<TextField> getTextFields() {
        return textFieldsAmountBread;
    }

    public TextField getFirst(){
        return getTextFields().get(0);
    }





    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        return scene = new Scene(group, 850, 650, Color.web("#ffc46b"));
    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPanel(),getBackToMenuButton(),breadOptionComponents.getBaguetteImageView(),
                breadOptionComponents.getCroissantImageView(),breadOptionComponents.getRollBreadImageView(),
                breadOptionComponents.getBreadImageView(),breadOptionComponents.getRollsImageView(),breadOptionComponents.getToastImageView());
    }
}

