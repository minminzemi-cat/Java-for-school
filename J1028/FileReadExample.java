package J1028;
import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileReadExample {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\work\\java-for-school\\J1028\\input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;

            while((s =br.readLine()) != null){
                System.out.println(s + "をよみました");
            }
         br.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
