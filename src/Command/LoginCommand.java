package Command;

import Exception.InterruptOperationException;
import src.ConsoleHelper;

public class LoginCommand implements Command{
    @Override
    public void execute() throws InterruptOperationException {
        String nomerKart = "123456789012";
        String pin = "1234";
        while (true) {
            ConsoleHelper.writeMessage("Введите номер карты и пароль");

            String s1 = ConsoleHelper.readString();
            String s2 = ConsoleHelper.readString();
            if (s1 == null || (s1 = s1.trim()).length() != 12 || s2 == null || (s2 = s2.trim()).length() != 4) {
                ConsoleHelper.writeMessage("Данные некорректны");
            } else {
                try {
                    if (s1.equals(nomerKart) && s2.equals(pin)) {
                        ConsoleHelper.writeMessage("successful verification");
                        break;
                    } else {
                        ConsoleHelper.writeMessage(String.format("Credit card [%s] is not verified.", s1));
                        ConsoleHelper.writeMessage("Please try again or type 'EXIT' for urgent exiting");
                    }


                } catch (NumberFormatException e) {
                    ConsoleHelper.writeMessage("Please specify valid credit card number - 12 digits, pin code - 4 digits.");
                }


            }
        }



    }
}
