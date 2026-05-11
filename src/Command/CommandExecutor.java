package Command;


import src.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    public static Map<Operation,Command> allKnownCommandsMap = new HashMap<>();

    static {
        allKnownCommandsMap.put(Operation.DEPOSIT, new DepositCommand());
        allKnownCommandsMap.put(Operation.WITHDRAW, new WithdrawCommand());
        allKnownCommandsMap.put(Operation.INFO, new InfoCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());}



    private CommandExecutor(){};

    public static final void execute(Operation operation) throws IOException {allKnownCommandsMap.get(operation).execute();}
}
