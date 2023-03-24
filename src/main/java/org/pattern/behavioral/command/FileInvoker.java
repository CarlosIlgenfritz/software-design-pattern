package org.pattern.behavioral.command;

import org.pattern.behavioral.command.interfaces.Command;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command c){
        this.command=c;
    }

    public void execute(){
        this.command.execute();
    }
}
