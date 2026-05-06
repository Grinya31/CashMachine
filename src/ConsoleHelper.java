import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleHelper {

    private static final BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message){System.out.println(message);};
    public static String readString() throws IOException {
        try{String s = bis.readLine();
            return s;}
        catch (IOException e){}
        return null;
    }

}
