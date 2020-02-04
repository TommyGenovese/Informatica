package Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {
    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static int readInteger(String message){
        int number = 0;
        boolean err;
        do{
            err= false;
            System.out.println(message);
            try {
                number = Integer.parseInt(keyboard.readLine());
                err = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            } catch (IOException e) {
                System.out.println("IO error");
            }
        }while(!err);
        return number;
    }

    public static int readInteger(){
        int number;
        number=readInteger("Insert integer:");
        return number;
    }


    public static float readFloat(String message){
        float number = 0;
        boolean err;
        do{
            err= false;
            System.out.println(message);
            try {
                number = Float.parseFloat(keyboard.readLine());
                err = true;
            } catch (IOException e) {
                System.out.println("IO error");
            } catch (NumberFormatException e) {
                System.out.println("Invalid float");
            }
        }while(!err);
        return number;
    }

    public static float readFloat(){
        float number;
        number=readFloat("Insert Float:");
        return number;
    }

    public static String readString(String message){
        String out = "";
        boolean err;
        do{
            err= false;
            System.out.println(message);
            try {
                out = keyboard.readLine();
                err = true;
            } catch (IOException e) {
                System.out.println("IO error");
            } catch (NumberFormatException e) {
                System.out.println("Invalid float");
            }
        }while(!err);
        return out;
    }

    public static String readString(){
        String s;
        s=readString("Insert String:");
        return s;
    }

}