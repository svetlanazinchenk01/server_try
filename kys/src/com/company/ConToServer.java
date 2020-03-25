package com.company;
//package sample;

//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;

public class ConToServer {
    private String host = "localhost";
    private Integer port = 8691;
    private Socket socket;
    private DataInputStream din;
    private DataOutputStream dout;


    public ConToServer() {
        try {
            socket = new Socket(host, port);
            dout = new DataOutputStream(socket.getOutputStream());
            din = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean sendTOServer() {

        try {
            dout.writeUTF("Hello");
            dout.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void listenServer(){
    //public String listenServer(){
       // String str = "";
        //try {

        JSONParser parser = new JSONParser();
        //Files.copy(din, new File("C:/svetka_try/test.json").toPath());

        try {
            Files.copy(din, new File("C:/svetka_try/test.json").toPath());

            Object obj = parser.parse(new FileReader("C:/svetka_try/test.json"));


            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("name");
            System.out.println(name);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}









        //BufferedReader in = new BufferedReader(new InputStreamReader(din));
            //JSONObject json = new JSONObject(in.readLine());
           /*String noReset = "Could not reset.";
            System.out.println(in.readLine());
            String result ="";
            String output = null;
            System.out.println(in.readLine());
            while ((result = in.readLine()) != null) {
                //System.out.println("рврвроврррврвырврр");
                output = result.replace("[", "").replace("]", "");
                System.out.println(output);
                System.out.println("1o12utput");
                JSONObject jsonObject = new JSONObject(output);
                JSONArray jsonArray = new JSONArray(output);
                System.out.println(jsonObject);
                System.out.println("fffff");}
            System.out.println(in.readLine());
            str = din.readUTF();
            System.out.println(str);
        }
            catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return str;
    }


    public  void close(){

    }*/


