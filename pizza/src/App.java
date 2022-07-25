import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.scene.text.Text;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.image.*;

public class App extends Application {
   int p1 = 0,p2,p3,p4,p5,p6,p7,p8,totPrice;

   @Override
   public void start(Stage stage) {

      Label user = new Label("Username");
      TextField box1 = new TextField();
      HBox userLine = new HBox(32);
      userLine.getChildren().addAll(user,box1);

      Label pwd = new Label("Password");
      PasswordField box2 = new PasswordField();
      HBox pwdLine = new HBox(32);
      pwdLine.getChildren().addAll(pwd,box2);

      Label addr = new Label("Address");
      TextField box3 = new TextField();
      HBox addrLine = new HBox(32);
      addrLine.getChildren().addAll(addr,box3);

     //login btn
      Button btn = new Button();
      btn.setText("Login");

      //btn click
             EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

                public void handle(ActionEvent e)

                { 
                 
                  
                  Stage stage2 = new Stage();    
                                              
                                
                                          //Pizza 1 start                                         
                                          Image image1 = new Image("./images/pizza1.jpg");  
                                          ImageView imgView1 = new ImageView(image1); 

                                          //setting the fit height and width of the image view 
                                          imgView1.setX(10.0); 
                                          imgView1.setY(10.0); 
                                          imgView1.setFitWidth(104); 
                                          imgView1.setFitHeight(104); 
                                                                                 
                                          //Setting the preserve ratio of the image view 
                                          imgView1.setPreserveRatio(true);  

                                          Text t11 = new Text ("Golden Corn");
                                          Text t12 = new Text ("Price Rs.200");
                                          
                                          Text t13 = new Text("Quantity");
                                          ComboBox<String> cb1 = new ComboBox<String>();
                                                cb1.getItems().add("1");
                                                cb1.getItems().add("2");
                                                cb1.getItems().add("3");
                                                cb1.getItems().add("4");
                                                cb1.getItems().add("5");

                                                cb1.setOnAction((event) -> {
                                                   int selectedIndex = cb1.getSelectionModel().getSelectedIndex();
                                                   int p = (selectedIndex)*200;
                                                   p1 = p;
                                               });

                                          HBox line13 = new HBox(8);
                                          line13.getChildren().addAll(t13,cb1);
                                         
                                          
                                          VBox imgRight1 = new VBox(16);
                                          imgRight1.getChildren().addAll(t11,t12,line13);
                         
                              FlowPane box1 = new FlowPane();  
                              box1.setHgap(16);
                              box1.getChildren().addAll(imgView1,imgRight1);
//---------------------------------------------------------------------------------------------
                            
                                          //Pizza 2 start                                         
                                          Image image2 = new Image("./images/pizza2.jpg");  
                                          ImageView imgView2 = new ImageView(image2); 
                                          
                                          //setting the fit height and width of the image view 
                                          imgView2.setX(50.0); 
                                          imgView2.setY(50.0); 
                                          imgView2.setFitWidth(104); 
                                          imgView2.setFitHeight(104); 
                                                                                 
                                          //Setting the preserve ratio of the image view 
                                          imgView2.setPreserveRatio(true);  

                                          Text t21 = new Text ("Golden Corn");
                                          Text t22 = new Text ("lorem ipsum dolor sit");
                                          Text t23 = new Text("Quantity");

                                          ComboBox<String> cb2 = new ComboBox<String>();
                                                cb2.getItems().add("1");
                                                cb2.getItems().add("2");
                                                cb2.getItems().add("3");
                                                cb2.getItems().add("4");
                                                cb2.getItems().add("5");

                                                cb2.setOnAction((event) -> {
                                                   int selectedIndex = cb2.getSelectionModel().getSelectedIndex();
                                                   int p = (selectedIndex)*200;
                                                   p2 = p;
                                               });

                                          HBox line23 = new HBox(8);
                                          line23.getChildren().addAll(t23,cb2);
                                          
                                          VBox imgRight2 = new VBox(16);
                                          imgRight2.getChildren().addAll(t21,t22,line23);
                         
                              FlowPane box2 = new FlowPane();  
                              box2.setHgap(16);
                              box2.getChildren().addAll(imgView2,imgRight2);
//--------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------
                            
                                          //Pizza 3 start                                         
                                          Image image3 = new Image("./images/pizza3.jpg");  
                                          ImageView imgView3 = new ImageView(image3); 
                                          
                                          //setting the fit height and width of the image view 
                                          imgView3.setX(0.0); 
                                          imgView3.setY(100.0); 
                                          imgView3.setFitWidth(104); 
                                          imgView3.setFitHeight(104); 
                                                                                 
                                          //Setting the preserve ratio of the image view 
                                          imgView3.setPreserveRatio(true);  

                                          Text t31 = new Text ("Veggie delight");
                                          Text t32 = new Text ("Rs.399");
                                          Text t33 = new Text("Quantity");
                                          ComboBox<String> cb3 = new ComboBox<String>();
                                                cb3.getItems().add("1");
                                                cb3.getItems().add("2");
                                                cb3.getItems().add("3");
                                                cb3.getItems().add("4");
                                                cb3.getItems().add("5");

                                                cb3.setOnAction((event) -> {
                                                   int selectedIndex = cb3.getSelectionModel().getSelectedIndex();
                                                   int p = (selectedIndex)*399;
                                                   p3 = p;
                                               });

                                          HBox line33 = new HBox(8);
                                          line33.getChildren().addAll(t33,cb3);
                                          
                                          VBox imgRight3 = new VBox(16);
                                          imgRight3.getChildren().addAll(t31,t32,line33);
                         
                              FlowPane box3 = new FlowPane();  
                              box3.setHgap(16);
                              box3.getChildren().addAll(imgView3,imgRight3);
//--------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------
                            
                                          //Pizza 4 start                                         
                                          Image image4 = new Image("./images/pizza4.jpg");  
                                          ImageView imgView4 = new ImageView(image4); 
                                          
                                          //setting the fit height and width of the image view 
                                          imgView4.setX(50.0); 
                                          imgView4.setY(100.0); 
                                          imgView4.setFitWidth(104); 
                                          imgView4.setFitHeight(104); 
                                                                                 
                                          //Setting the preserve ratio of the image view 
                                          imgView4.setPreserveRatio(true);  

                                          Text t41 = new Text ("Golden Corn");
                                          Text t42 = new Text ("lorem ipsum dolor sit");
                                          Text t43 = new Text("Quantity");

                                          ComboBox<String> cb4 = new ComboBox<String>();
                                                cb4.getItems().add("1");
                                                cb4.getItems().add("2");
                                                cb4.getItems().add("3");
                                                cb4.getItems().add("4");
                                                cb4.getItems().add("5");

                                                cb4.setOnAction((event) -> {
                                                   int selectedIndex = cb4.getSelectionModel().getSelectedIndex();
                                                   int p = (selectedIndex)*200;
                                                   p4 = p;
                                               });

                                          HBox line43 = new HBox(8);
                                          line43.getChildren().addAll(t43,cb4);
                                         
                                          
                                          VBox imgRight4 = new VBox(16);
                                          imgRight4.getChildren().addAll(t41,t42,line43);
                         
                              FlowPane box4 = new FlowPane();  
                              box4.setHgap(16);
                              box4.getChildren().addAll(imgView4,imgRight4);
//--------------------------------------------------------------------------------------------------


//---------------------------------------------------------------------------------------------
                            
                                          //Pizza 5 start                                         
                                          Image image5 = new Image("./images/pizza5.jpg");  
                                          ImageView imgView5 = new ImageView(image5); 
                                          
                                          //setting the fit height and width of the image view 
                                          imgView5.setX(50.0); 
                                          imgView5.setY(100.0); 
                                          imgView5.setFitWidth(104); 
                                          imgView5.setFitHeight(104); 
                                                                                 
                                          //Setting the preserve ratio of the image view 
                                          imgView5.setPreserveRatio(true);  

                                          Text t51 = new Text ("Cheesy Margerita");
                                          Text t52 = new Text ("Rs.299");
                                          Text t53 = new Text("Quantity");

                                          ComboBox<String> cb5 = new ComboBox<String>();
                                                cb5.getItems().add("1");
                                                cb5.getItems().add("2");
                                                cb5.getItems().add("3");
                                                cb5.getItems().add("4");
                                                cb5.getItems().add("5");

                                                cb5.setOnAction((event) -> {
                                                   int selectedIndex = cb5.getSelectionModel().getSelectedIndex();
                                                   int p = (selectedIndex)*200;
                                                   p5 = p;
                                               });

                                          HBox line53 = new HBox(8);
                                          line53.getChildren().addAll(t53,cb5);
                                         
                                          
                                          VBox imgRight5 = new VBox(16);
                                          imgRight5.getChildren().addAll(t51,t52,line53);
                         
                              FlowPane box5 = new FlowPane();  
                              box5.setHgap(16);
                              box5.getChildren().addAll(imgView5,imgRight5);
//--------------------------------------------------------------------------------------------------
                              

//---------------------------------------------------------------------------------------------
                            
                                          //Pizza 6 start                                         
                                          Image image6 = new Image("./images/pizza6.jpg");  
                                          ImageView imgView6 = new ImageView(image6); 
                                          
                                          //setting the fit height and width of the image view 
                                          imgView6.setX(50.0); 
                                          imgView6.setY(100.0); 
                                          imgView6.setFitWidth(104); 
                                          imgView6.setFitHeight(104); 
                                                                                 
                                          //Setting the preserve ratio of the image view 
                                          imgView6.setPreserveRatio(true);  

                                          Text t61 = new Text ("Cheesy Margerita");
                                          Text t62 = new Text ("Rs.299");
                                          Text t63 = new Text("Quantity");

                                          ComboBox<String> cb6 = new ComboBox<String>();
                                                cb6.getItems().add("1");
                                                cb6.getItems().add("2");
                                                cb6.getItems().add("3");
                                                cb6.getItems().add("4");
                                                cb6.getItems().add("5");

                                                cb6.setOnAction((event) -> {
                                                   int selectedIndex = cb6.getSelectionModel().getSelectedIndex();
                                                   int p = (selectedIndex)*200;
                                                   p6 = p;
                                               });

                                          HBox line63 = new HBox(8);
                                          line63.getChildren().addAll(t63,cb6);
                                         
                                          
                                          VBox imgRight6 = new VBox(16);
                                          imgRight6.getChildren().addAll(t61,t62,line63);
                         
                              FlowPane box6 = new FlowPane();  
                              box6.setHgap(16);
                              box6.getChildren().addAll(imgView6,imgRight6);
//--------------------------------------------------------------------------------------------------


//---------------------------------------------------------------------------------------------
                            
                                          //Pizza 7 start                                         
                                          Image image7 = new Image("./images/pizza7.jpg");  
                                          ImageView imgView7 = new ImageView(image7); 
                                          
                                          //setting the fit height and width of the image view 
                                          imgView7.setX(50.0); 
                                          imgView7.setY(100.0); 
                                          imgView7.setFitWidth(104); 
                                          imgView7.setFitHeight(104); 
                                                                                 
                                          //Setting the preserve ratio of the image view 
                                          imgView7.setPreserveRatio(true);  

                                          Text t71 = new Text ("Cheesy Margerita");
                                          Text t72 = new Text ("Rs.299");
                                          Text t73 = new Text("Quantity");

                                          ComboBox<String> cb7 = new ComboBox<String>();
                                                cb7.getItems().add("1");
                                                cb7.getItems().add("2");
                                                cb7.getItems().add("3");
                                                cb7.getItems().add("4");
                                                cb7.getItems().add("5");

                                                cb7.setOnAction((event) -> {
                                                   int selectedIndex = cb7.getSelectionModel().getSelectedIndex();
                                                   int p = (selectedIndex)*200;
                                                   p7 = p;
                                               });

                                          HBox line73 = new HBox(8);
                                          line73.getChildren().addAll(t73,cb7);
                                         
                                          
                                          VBox imgRight7 = new VBox(16);
                                          imgRight7.getChildren().addAll(t71,t72,line73);
                         
                              FlowPane box7 = new FlowPane();  
                              box7.setHgap(16);
                              box7.getChildren().addAll(imgView7,imgRight7);
//--------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------
                            
                                          //Pizza 8 start                                         
                                          Image image8 = new Image("./images/pizza8.jpg");  
                                          ImageView imgView8 = new ImageView(image8); 
                                          
                                          //setting the fit height and width of the image view 
                                          imgView8.setX(50.0); 
                                          imgView8.setY(100.0); 
                                          imgView8.setFitWidth(104); 
                                          imgView8.setFitHeight(104); 
                                                                                 
                                          //Setting the preserve ratio of the image view 
                                          imgView8.setPreserveRatio(true);  

                                          Text t81 = new Text ("Cheesy Margerita");
                                          Text t82 = new Text ("Rs.299");
                                          Text t83 = new Text("Quantity");

                                          ComboBox<String> cb8 = new ComboBox<String>();
                                                cb8.getItems().add("1");
                                                cb8.getItems().add("2");
                                                cb8.getItems().add("3");
                                                cb8.getItems().add("4");
                                                cb8.getItems().add("5");

                                                cb8.setOnAction((event) -> {
                                                   int selectedIndex = cb8.getSelectionModel().getSelectedIndex();
                                                   int p = (selectedIndex)*200;
                                                   p8 = p;
                                               });

                                          HBox line83 = new HBox(8);
                                          line83.getChildren().addAll(t83,cb8);
                                         
                                          
                                          VBox imgRight8 = new VBox(16);
                                          imgRight8.getChildren().addAll(t81,t82,line83);
                         
                              FlowPane box8 = new FlowPane();  
                              box8.setHgap(16);
                              box8.getChildren().addAll(imgView8,imgRight8);
//--------------------------------------------------------------------------------------------------
          
          












                              FlowPane root = new FlowPane();
                              root.setAlignment(Pos.CENTER); 
                              root.getChildren().addAll(box1,box2,box3,box4,box5,box6,box7,box8);


                              Button getTotBtn = new Button("Get total");

                              Label myTotal = new Label("____");
                              getTotBtn.setOnAction((event) -> {
                               totPrice = p1+p2+p3+p4+p5+p6+p7+p8; 
                               myTotal.setText("The Total order amount is: " + totPrice);
                              //  Text orderTot = new Text("The Total order is:" + totPrice);
                              });
                             
                              Button orderBtn = new Button("Order Now");

                              VBox mainRoot = new VBox();
                              mainRoot.getChildren().addAll(root,getTotBtn,myTotal,orderBtn);
                              Scene scene2 = new Scene(mainRoot, 800, 800, Color.BLUE);
                              stage2.setTitle("Pizza Delivery App");
                          
                              //   scene.getStylesheets().add("./pizzaApp.css");
                              
                              stage2.setScene(scene2);
                              stage2.show();
                           }
                        
              

         };

      //when button is pressed
      btn.setOnAction(event);

      Text h1 = new Text ("Please Login to order PIZZAS!");

      VBox vb = new VBox(16.0); 
      vb.setPadding(new Insets(56, 256, 56, 256));
      vb.setAlignment(Pos.CENTER);
      vb.getChildren().addAll(h1,userLine,pwdLine,addrLine,btn);

      //StackPane root = new StackPane();  

      Scene scene = new Scene(vb, 800, 800, Color.BEIGE);
      stage.setTitle("Pizza Delivery App");

      //scene.getStylesheets().add("./pizzaApp.css");
     
      stage.setScene(scene);
      stage.show();
   }

   

   public static void main(String args[]){
      launch(args);

   }

}