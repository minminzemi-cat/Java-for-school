public class ClassExample {

    //フィールド
    

    //インスタンス変数
    int num;
    String message;

    //クラス変数
    static int price = 0;

    //コンストラクタ（初期化処理をするメソッド）
    ClassExample(int num,String message){
        this.num =num;
        this.message=message;
    }

    //メソッド（機能、関数みたいなの）

    //インスタンスメソッド
    int add(int x,int y){
        return x+y;
    }

    //クラスメソッド
    static int sum(int x,int y,int z){
        return x+y+z;
    }

}
