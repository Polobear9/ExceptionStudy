import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Error {
    int a;
    //b int; -- > compile error(SOV error)

    public static void main(String[] args) {
        String[] names = null;
        //System.out.println(names[0]); --> java Null-pointerException;
        //Exception is are class. java.lang.Exception; ***
        //Exception is meaning that the program is not working and the program has a problem.

        names = new String[]{"apple"};
        //System.out.println(names[1]); --> java.lang.ArrayIndexOutOfBoundsException;
        //this exception is meaning can not access to the Array.

        //LogicError
        //System.out.println("3 + 5" + 3 + 5); --> Output : 3 + 535;
        List<Character> text = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("" + "C:\\test.txt");
            while(true){
                int t = fileReader.read();
                if(t == -1){
                    break;
                }else{
                System.out.print((char)t);
                }
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}