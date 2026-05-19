package Command;

import src.ConsoleHelper;
import Exception.*;
import java.io.IOException;

public class ExitCommand implements Command{
    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Вы действительно хотите выйти: y/n");
        String str = ConsoleHelper.readString();
        if (str.equalsIgnoreCase("y") || str.equalsIgnoreCase("n")){ ConsoleHelper.writeMessage("До скорой встречи");throw new InterruptOperationException();}
        else {

        }
    }
}
