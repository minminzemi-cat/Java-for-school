package J1028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample2 {
    public static void main(String[] args) {
        //キーボードからの入力を受け付ける処理
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);


        System.out.println("実数を入力してください");
        try{
            String line = reader.readLine();
            //キーボードから読み込み
            String name = reader.readLine();
           
            double val = Double.parseDouble(line);

            System.out.println("入力された値の平方根は" + Math.sqrt(val));
            //読み込み終了時の後かたずけ
            reader.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
