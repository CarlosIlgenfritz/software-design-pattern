package org.pattern.behavioral.command.commands;

import org.pattern.behavioral.command.interfaces.Command;
import org.pattern.behavioral.command.interfaces.FileSystemReceiver;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand (FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }


    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
