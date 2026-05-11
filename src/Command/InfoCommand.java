package Command;
import src.ConsoleHelper;
import src.CurrencyManipulator;
import src.CurrencyManipulatorFactory;
public class InfoCommand implements Command{
    @Override
    public void execute() {
            boolean hasAnyMoney = false;

            for (CurrencyManipulator manipulator : CurrencyManipulatorFactory.getAllCurrencyManipulators()) {
                if (manipulator.hasMoney()) {
                    ConsoleHelper.writeMessage(
                            manipulator.getCurrencyCode() + " - " + manipulator.getTotalAmount()
                    );
                    hasAnyMoney = true;
                }
            }

            if (!hasAnyMoney) {
                ConsoleHelper.writeMessage("No money available in any currency.");
            }
        }
}
