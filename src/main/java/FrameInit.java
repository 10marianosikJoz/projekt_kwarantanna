import login_page_components.LoginPageComponents;
import login_page_components.Icons;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import login_data.UserLoginData;
import scenes_init.*;
import second_scene.SecondSceneInit;


public class FrameInit extends Application {
    private Group group;
    private Scene scene;
    private LoginPageComponents loginPageComponents = new LoginPageComponents();
    private Icons icons = new Icons();
    private SecondSceneInit secondSceneInit = new SecondSceneInit();
    private AccountInfoScene accountInfoScene = new AccountInfoScene();
    private PaymentScene paymentScene = new PaymentScene();
    private BreadOptionScene breadOptionScene = new BreadOptionScene();
    private FruitOptionScene fruitOptionScene = new FruitOptionScene();
    private DrinkOptionScene drinkOptionScene = new DrinkOptionScene();
    private UserLoginData userLoginData = new UserLoginData();
    private ExchangeMoney exchangeMoney = new ExchangeMoney();
    private VegetableOptionScene vegetableOptionScene = new VegetableOptionScene();
    private ShoppingCart shoppingCart = new ShoppingCart();

    public static void main(String[] args) {
        launch(args);
    }

    public Group initGroupLayout() {
        return group = new Group();
    }

    public Scene getScene() {
        if(scene == null){
            return scene = new Scene(group, 600, 600, Color.web("#ffc46b"));
        }else
            return scene;

    }


    @Override
    public void start(Stage primaryStage) {

        initGroupLayout();
        secondSceneInit.getSecondGroupLayout();
        accountInfoScene.addNodesToLayout();
        paymentScene.addNodesToGroup();
        breadOptionScene.addNodesToLayout();
        fruitOptionScene.addNodesToLayout();
        secondSceneInit.addToSecondLayout();
        drinkOptionScene.addNodesToLayout();
        exchangeMoney.addNodesToLayout();
        vegetableOptionScene.addNodesToLayout();
        shoppingCart.addNodesToLayout();



        initGroupLayout().getChildren().addAll(loginPageComponents.getLog(), loginPageComponents.getPassword(), loginPageComponents.getLogButton(),icons.getLogImageView());

        loginPageComponents.setLogFieldLocation();
        loginPageComponents.setPromptForLogin(loginPageComponents.getLog());
        loginPageComponents.getLog().setAlignment(Pos.CENTER);
        loginPageComponents.getLog().setPrefSize(250, 35);
        loginPageComponents.getLog().setStyle("-fx-background-radius: 22");



        loginPageComponents.setPasswordFieldLocation();
        loginPageComponents.setPromptForPassword(loginPageComponents.getPassword());
        loginPageComponents.getPassword().setAlignment(Pos.CENTER);
        loginPageComponents.getPassword().setPrefSize(250, 35);
        loginPageComponents.getPassword().setStyle("-fx-background-radius: 22");

        icons.setLogImageView();


        loginPageComponents.buttonLogFiledLocation();
        loginPageComponents.getLogButton().setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22 ");
        loginPageComponents.getLogButton().setPrefSize(150, 35);
        loginPageComponents.getLogButton().setTextFill(Color.WHITE);
        loginPageComponents.getLogButton().setDisable(true);
        loginPageComponents.LoginFieldListener();
        loginPageComponents.PasswordFieldListener();


        loginPageComponents.getLogButton().setOnAction(e -> {

            if (loginPageComponents.getLoginText().equals(userLoginData.getLogin()) && loginPageComponents.getPasswordText().equals(userLoginData.getPassword())) {
                primaryStage.setScene(secondSceneInit.getScene2());
                primaryStage.centerOnScreen();
            }


        });


        accountInfoScene.getBackToMenuButton().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });

        breadOptionScene.getBackToMenuButton().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
        primaryStage.centerOnScreen();



        });
        exchangeMoney.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });

        drinkOptionScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        paymentScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        fruitOptionScene.getBackToMenu().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        vegetableOptionScene.getBackToMenuButton().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });
        shoppingCart.getBackToMenuButton().setOnAction(e -> {
            primaryStage.setScene(secondSceneInit.getDuplicateScene());
            primaryStage.centerOnScreen();
        });



            secondSceneInit.getButtonsList().get(0).setOnAction(e -> {
                primaryStage.setScene(accountInfoScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(1).setOnAction(e -> {

                primaryStage.setScene(fruitOptionScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(2).setOnAction(e -> {

                primaryStage.setScene(breadOptionScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(3).setOnAction(e -> {

                primaryStage.setScene(exchangeMoney.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(4).setOnAction(e -> {
                primaryStage.setScene(paymentScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(5).setOnAction(e -> {
                primaryStage.setScene(drinkOptionScene.getScene());
                primaryStage.centerOnScreen();
            });
            secondSceneInit.getButtonsList().get(6).setOnAction(e -> {
                primaryStage.setScene(vegetableOptionScene.getScene());
                primaryStage.centerOnScreen();
            });
        secondSceneInit.getButtonsList().get(7).setOnAction(e -> {
            primaryStage.setScene(shoppingCart.getScene());
            primaryStage.centerOnScreen();
        });







        primaryStage.centerOnScreen();
        primaryStage.setScene(getScene());
        primaryStage.setTitle("Application");
        primaryStage.setResizable(false);
        primaryStage.setFullScreen(false);
        primaryStage.show();


    }

}
