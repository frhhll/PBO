package com.example.modul6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane,500,500);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        stage.setTitle("Time Table");

        Text welcome = new Text("Biodata Mahasiswa");
        welcome.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,30));
        gridPane.add(welcome,0,0);

        //Nama
        Label nama = new Label("Nama");
        gridPane.add(nama,0,1);
        TextField namaField = new TextField();
        gridPane.add(namaField,1,1);

        //NIM
        Label nim = new Label("NIM");
        gridPane.add(nim,0,2);
        TextField nimField = new TextField();
        gridPane.add(nimField,1,2);

        //Email
        Label email = new Label("Email");
        gridPane.add(email,0,3);
        TextField emailField = new TextField();
        gridPane.add(emailField,1,3);

        //Jurusan
        Label jurusan = new Label("Jurusan");
        gridPane.add(jurusan,0,4);
        TextField jurusanField = new TextField();
        gridPane.add(jurusanField,1,4);

        //Fakultas
        Label fakultas = new Label("Fakultas");
        gridPane.add(fakultas,0,5);
        TextField fakultasField = new TextField();
        gridPane.add(fakultasField,1,5);

        //Alamat
        Label alamat = new Label("Alamat");
        gridPane.add(alamat,0,6);
        TextField alamatField = new TextField();
        gridPane.add(alamatField,1,6);

        //Kota
        Label kota = new Label("Kota");
        gridPane.add(kota,0,7);
        TextField kotaField = new TextField();
        kotaField.setPrefWidth(500);
        gridPane.add(kotaField,1,7);

        //Tabel Aplikasi
        Button btn = new Button("Buat");
        gridPane.add(btn,1,9);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
//                GridPane gridPane1 = new GridPane();
//                gridPane1.setAlignment(Pos.CENTER);
                Scene scene1 = new Scene(new Group());
                stage.setTitle("Biodata Mahasiswa");
                Text welcome2 = new Text("Biodata Mahasiswa");
                welcome2.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD,30));

                stage.setWidth(500);
                stage.setHeight(500);
                Text Nama2 = new Text("Nama : "+namaField.getText());
                Text NIM2 = new Text("NIM   : "+nimField.getText());
                Text email2 = new Text("Email : "+emailField.getText());
                Text jurusan2 = new Text("Jurusan : "+jurusanField.getText());
                Text fakultas = new Text("Fakultas : "+fakultasField.getText());
                Text alamat = new Text("Alamat : "+alamatField.getText());
                Text kota = new Text("Kota : "+kotaField.getText());
                Button kembali = new Button("Kembali");
                kembali.setAlignment(Pos.BASELINE_RIGHT);

                VBox vBox = new VBox();
                vBox.getChildren().addAll(welcome2,Nama2,NIM2,email2,jurusan2,fakultas,alamat,kota,kembali);

                ((Group) scene1.getRoot()).getChildren().addAll(vBox);

                kembali.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        stage.setScene(scene);
                    }
                });
                stage.setScene(scene1);
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}