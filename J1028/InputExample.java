package J1028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {
    public static void main(String[] args) {
        System.out.println("あなたのお名前は？");

        //キーボードからの入力を受け付ける処理
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        try{
            //キーボードから読み込み
            String name = reader.readLine();
            System.out.println("こんにちは。" + name + "さん");

            //読み込み終了時の後かたずけ
            reader.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
