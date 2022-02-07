package jrm;

public class CheckNumber extends ShowResult{
    void checkResult(){
        WriteItDown writeItDown = new WriteItDown();
        writeItDown.consoleRead();
        if (writeItDown.consoleRead() < 5) System.out.println("введенное Вами число меньше 5");
    }
}
