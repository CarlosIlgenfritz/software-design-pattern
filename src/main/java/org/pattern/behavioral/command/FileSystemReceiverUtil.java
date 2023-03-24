package org.pattern.behavioral.command;

import org.pattern.behavioral.command.interfaces.FileSystemReceiver;
import org.pattern.behavioral.command.receiver.UnixFileSystemReceiver;
import org.pattern.behavioral.command.receiver.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }else{
            return new UnixFileSystemReceiver();
        }
    }
}
