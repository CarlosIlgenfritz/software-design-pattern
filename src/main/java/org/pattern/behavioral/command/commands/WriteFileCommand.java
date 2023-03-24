package org.pattern.behavioral.command.commands;

import org.pattern.behavioral.command.interfaces.Command;
import org.pattern.behavioral.command.interfaces.FileSystemReceiver;

public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}
