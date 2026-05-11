

import Command.CommandExecutor;
import src.ConsoleHelper;
import src.CurrencyManipulator;
import src.Operation;

import java.io.IOException;
import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ENGLISH);
        Operation oper;
        do {
            oper = ConsoleHelper.askOperation();
            CommandExecutor.execute(oper);
        }
        while (oper != Operation.EXIT);


    }
}