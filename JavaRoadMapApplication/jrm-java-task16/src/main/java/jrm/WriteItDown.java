package jrm;

import java.util.Scanner;

public class WriteItDown extends CheckNumber{
    int consoleRead(){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
}
