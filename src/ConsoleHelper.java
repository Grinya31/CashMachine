

import src.Operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ConsoleHelper {

    private static final BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message){System.out.println(message);};
    public static String readString() throws IOException {
            try {
                String text = bis.readLine();
                return text;
            } catch (IOException ignored) {
                /* NOP */
            }
            return null;


    }

    public static String askCurrencyCode() throws IOException {


        while (true){
            ConsoleHelper.writeMessage("Введите код валюты");
            String s = ConsoleHelper.readString();
            if (s == null || s.trim().length() != 3){ConsoleHelper.writeMessage("Данные некорректны");
            continue;}
        return s.trim().toUpperCase();}
    }

    public static String[] getValidTwoDigits(String currencyCode) throws IOException {


        while (true){
            ConsoleHelper.writeMessage("Введите два целых числа");
            String[] str = null;
            String s = ConsoleHelper.readString();
            if ( s == null || ((str = (s.split(" "))).length!= 2)){ ConsoleHelper.writeMessage("Данные некорректны");}
            else{
                try{
                    if (Integer.parseInt(str[0])<=0 || Integer.parseInt(str[1])<=0){
                        ConsoleHelper.writeMessage("Данные некорректны");}
                    } catch (NumberFormatException e) {
                        ConsoleHelper.writeMessage("Please specify valid data.");
                        continue;
                    }
                    return str;


                    }
                }

    }
    public static Operation askOperation() throws IOException {
        while (true) {
            ConsoleHelper.writeMessage("Введите команду 1-INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT; от 1 до 4");
            String s = ConsoleHelper.readString();
            Integer i = Integer.parseInt(s);
            if (s == null || i < 1 || i > 4) {
                ConsoleHelper.writeMessage("Данные некорректны");
                continue;
            }
            return Operation.getAllowableOperationByOrdinal(i);


        }
    }

}
