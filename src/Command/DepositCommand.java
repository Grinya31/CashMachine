package Command;

import src.ConsoleHelper;
import src.CurrencyManipulator;
import src.CurrencyManipulatorFactory;

import java.io.IOException;



class DepositCommand implements Command {
    @Override
    public void execute() throws IOException {
        ConsoleHelper.writeMessage("Deposuting....");
        String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);

        while (true) {
            String[] split = ConsoleHelper.getValidTwoDigits(currencyCode);
            try {
                int denomination = Integer.parseInt(split[0]);
                int count = Integer.parseInt(split[1]);
                manipulator.addAmount(denomination, count);
                ConsoleHelper.writeMessage(String.format("%d %s was deposited successfully", (denomination * count), currencyCode));
                break;
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("Please specify valid data.");
            }
        }


    }
}
