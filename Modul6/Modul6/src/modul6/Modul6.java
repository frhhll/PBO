/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package modul6;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Modul6 extends Application {
    @Override
    public void start(Stage primaryStage) {


        final TableView table = new TableView();


        GridPane grid1 = new GridPane();



        final Text actiontarget = new Text();
        grid1.add(actiontarget, 1, 6);

        Scene scene1 = new Scene(new Group());

        final Label label = new Label("Biodata Mahasiswa");
        label.setFont(new Font("Times New Rowman", 30));
        table.setEditable(true);

        TableColumn nameCol = new TableColumn("Nama");
        TableColumn nimCol = new TableColumn("NIM");
        TableColumn emailCol = new TableColumn("Email");
        TableColumn fakultasCol = new TableColumn("Fakultas");
        TableColumn jurusanCol = new TableColumn("Jurusan");
        TableColumn alamatCol = new TableColumn("Alamat");
        TableColumn kotaCol = new TableColumn("Kota");

        table.getColumns().addAll(nameCol, nimCol, emailCol, fakultasCol, jurusanCol, alamatCol, kotaCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(8);
        vbox.setPadding(new Insets(20, 10, 10, 10));
        vbox.getChildren().addAll(label, table);

        // memunculkan scane selanjutnya
        ((Group) scene1.getRoot()).getChildren().addAll(vbox);


        //buat output di scane 2
        nameCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa,String>("name")
        );

        nimCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa,String>("nim")
        );

        emailCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa,String>("email")
        );

        fakultasCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa,String>("fakultas")
        );

        jurusanCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa,String>("jurusan")
        );

        alamatCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa,String>("alamat")
        );

        kotaCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa,String>("kota")
        );

        //untuk menentukan seberapa banyak baris data yang ingin
        final ObservableList<Mahasiswa> data = FXCollections.observableArrayList(

        );

        table.setItems(data);


        primaryStage.setTitle("Biodata Mahasiswa");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: grey ");
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(40,40,40,40));//

        Scene scene = new Scene(grid,600,350);


        Text scenetitle = new Text("Data Mahasiswa UMM");
        scenetitle.setFont(Font.font("Tahome", FontWeight.NORMAL, 25));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("NAMA\t\t:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label nim = new Label("NIM\t\t\t:");
        grid.add(nim, 0, 2);

        TextField Nim = new TextField();
        grid.add(Nim, 1, 2);

        Label em = new Label ("EMAIL\t\t:");
        grid.add(em, 0, 3);

        TextField emTextField = new TextField();
        grid.add(emTextField, 1, 3);



        Label fak = new Label ("FAKULTAS\t:");
        grid.add(fak, 0, 4);

        TextField fakTextField = new TextField();
        grid.add(fakTextField, 1, 4);

        Label jur = new Label ("JURUSAN\t\t:");
        grid.add(jur, 0, 5);

        TextField jurTextField = new TextField();
        grid.add(jurTextField, 1, 5);

        Label ala = new Label ("ALAMAT\t\t:");
        grid.add(ala, 0, 6);

        TextField alaTextField = new TextField();
        grid.add(alaTextField, 1, 6);

        Label kot = new Label ("KOTA\t\t:");
        grid.add(kot, 0, 7);

        TextField kotTextField = new TextField();
        grid.add(kotTextField, 1, 7);


        Button tom = new Button("Create ");
        HBox hbTom = new HBox(10);
        hbTom.setAlignment(Pos.BOTTOM_RIGHT);
        hbTom.getChildren().add(tom);
        grid.add(hbTom, 1, 10);

        Text warning = new Text();
        grid.add(warning,3,2);

        Text kos = new Text ();
        grid.add(kos,3,10);

        tom.setOnAction((ActionEvent e) -> {

            if (userTextField.getText().isEmpty() || Nim.getText().isEmpty() || emTextField.getText().isEmpty()
                    || jurTextField.getText().isEmpty() || alaTextField.getText().isEmpty() || kotTextField.getText().isEmpty()
                    || fakTextField.getText().isEmpty()) {
                warning.setFill(Color.FIREBRICK);
                warning.setFont(Font.font("Arial Black", FontPosture.REGULAR, 15));
                warning.setText("Inputan Harus Terisi Semua!");
            }
            else if (Nim.getText().matches("[0-9]*")){
                data.add(new Mahasiswa(
                        userTextField.getText(),
                        Nim.getText(),
                        emTextField.getText() + "@webmail.umm.ac.id",
                        fakTextField.getText(),
                        jurTextField.getText(),
                        alaTextField.getText(),
                        kotTextField.getText()
                ));
                primaryStage.setScene(scene1);
            }
            else {
                Text wrn2 = new Text();
                wrn2.setFill(Color.FIREBRICK);
                wrn2.setFont(Font.font("Arial Black", FontPosture.REGULAR, 15));
                wrn2.setText("NIM Harus Menginput Angka!");
                grid.add(wrn2,3,9);
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args){
        launch(args);
    }


}