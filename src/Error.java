import java.io.*;
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
        //System.out.println("3 + 5=" + 3 + 5); --> Output : 3 + 5=35;
        //System.out.println("3 + 5" + (3 + 5)); --> is better than Up code. --> Output: 3+5=8;

        List<Character> text = new ArrayList<>();

        //if exception is thrown then we should write the try and catch block.
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("" + "C:\\test.txt");
            while (true) {
                int t = fileReader.read();
                if (t == -1) {
                    text.add((char) t);
                    break;
                } else {
                    System.out.print((char) t);
                }
            }
            System.out.println(text);

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\test.txt"));
            try {
                while(true){
                    int a = br.read();
                    if(a == -1){

                        break;
                    }else{
                        System.out.println(a);
                    }

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
