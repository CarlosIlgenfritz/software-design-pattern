package org.pattern.behavioral.command.commands;

import org.pattern.behavioral.command.interfaces.Command;
import org.pattern.behavioral.command.interfaces.FileSystemReceiver;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }
}
