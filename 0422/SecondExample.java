public class SecondExample {
    //JavaはMainから実行されるので、mainがないと動かない
    public static void main(String[] args){

        //php
        // &i=10;

        //10（数値）を保存する場合
        int i = 10;         //  int : 整数値専用の変数を作る宣言
        double j = 3.14;    //  double型　：　小数点がある値専用の変数を作る宣言
        String k="こにちは"; //  String型　：　文字、文字列専用の変数
        

        //ここでは画面に指定した文字を表示する処理
        //System.out.println("こん\nに\tちは\"山田さん\"");
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        //横一行で表示
        //System.out.print("あいうえお");
        //System.out.print("かきくけこ");
    }
}
//コメント