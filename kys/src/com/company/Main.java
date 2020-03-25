package com.company;
//package sample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.peer.DialogPeer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main  {


    public static ConToServer con = new ConToServer();
/*
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("chooseColor.fxml"));
        primaryStage.setTitle("Покупка без касира");
        primaryStage.setScene(new Scene(root));
        DialogPeer frame;
        primaryStage.show();
        String printData = "Joj";
        Connectionn b=new Connectionn();
        //b.OutInfo();
        //b.addtoProgramm();
    }
*/


    public static void main(String[] args) {
        con.sendTOServer();
        con.listenServer();
    }


}