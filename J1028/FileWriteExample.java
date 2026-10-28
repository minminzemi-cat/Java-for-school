package J1028;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import  java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWriteExample {
    public static void main(String[] args) {
       

        try{
           //支持のファイルを指定する
            File file = new File("C:\\work\\java-for-school\\J1028/text.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            //PrintWriter pw = new PrintWriter(pw);

            for(int i=0; i<5;i++){
                bw.write("[" + i + "]");
                bw.newLine();
            }
            bw.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
