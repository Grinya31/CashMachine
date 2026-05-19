

import Command.CommandExecutor;
import src.ConsoleHelper;
import src.CurrencyManipulator;
import src.Operation;
import Exception.InterruptOperationException;
import java.io.IOException;
import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) throws InterruptedException{
        Locale.setDefault(Locale.ENGLISH);
        try {
            Operation oper = Operation.LOGIN;
            CommandExecutor.execute(oper);
            do {
                oper = ConsoleHelper.askOperation();
                CommandExecutor.execute(oper);
            }
            while (oper != Operation.EXIT);
        }
        catch (InterruptOperationException e){
            ConsoleHelper.writeMessage("До скорой встречи!!!");
        }


    }
}