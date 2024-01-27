package commandPattern;

import java.util.Stack;

public class RemoteControllerInvoker {

    Stack<ICommand> commandHistory = new Stack<>();
    ICommand command;

    RemoteControllerInvoker(){};

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if(!commandHistory.isEmpty()) {
            ICommand lCommand = commandHistory.peek();
            commandHistory.pop();
            lCommand.unExecute();
        }
    }

}
