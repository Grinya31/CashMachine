

import src.CurrencyManipulator;

import java.io.IOException;
import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ENGLISH);
        String currencyCode = ConsoleHelper.askCurrencyCode();

        String[] digit = ConsoleHelper.getValidTwoDigits(currencyCode);
        int nominal = Integer.parseInt(digit[0]);
        int col = Integer.parseInt(digit[1]);
        CurrencyManipulator currencyManipulator = new CurrencyManipulator(currencyCode);
        currencyManipulator.addAmount(nominal,col);
        System.out.println(currencyManipulator.getTotalAmount());

    }
}