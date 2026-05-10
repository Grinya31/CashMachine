package Command;


import src.*;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    public static Map<Operation,Command> allKnownCommandsMap;



    public CommandExecutor() {
        this.allKnownCommandsMap = new HashMap<>();
    }
}
