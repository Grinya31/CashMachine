package Command;

import java.io.IOException;
import Exception.InterruptOperationException;

public interface Command {
    public void execute() throws InterruptOperationException;
}
