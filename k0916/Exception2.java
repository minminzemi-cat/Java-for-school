package k0916;

import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;

public class Exception2 {
    static void methodA() throws FileAlreadyExistsException{
            //FileReader fr = new FileReader("test.txt");
    }


    public static void main(String[] args) {
        try{
        methodA();
        }
        catch(FileAlreadyExistsException e){
            System.out.println(e);
        }
    }
}
