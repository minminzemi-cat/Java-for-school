public class Method {
    public static void main(String[] args){

        display();
        display(2,4);
        int num=display(2,3,4);
        System.out.println(num);
        System.out.println(display(2,3,4));
        System.out.println(display(1, 3, 7,5));

    }

    //下記メソッドを作ってください
    //メソッド名は好きに考える
    //戻り値なし
    //引数なし
    //処理内容
    //[1+1]の結果を画面に表示する
    //mainメソッドから呼び出す

    public static void display(){
        int num = 1;
        num++;

        System.out.println(num);
        
    }

     //下記メソッドを作ってください
    //メソッド名は好きに考える
    //戻り値なし
    //引数:int 2つ
    //処理内容
    //引数のint型の２つの値を足し算結果を画面に表示
    //mainメソッドから呼び出す
    public static void display(int a,int b){
        int r = a+b;
        System.out.println(r);
    }


     //下記メソッドを作ってください
    //メソッド名は好きに考える
    //戻り値:int 
    //引数:int 3つ
    //処理内容
    //引数のint型の3つの値を足し算結果を画面に表示
    //戻り値として呼び出し元へ返せ
    //mainメソッドから呼び出す
    public static int display(int a,int b,int c) {
        int num = a+b+c;
        System.out.println(num);

        return num;
    }

     public static int display(int a,int b,int c,int d) {
        int num = a+b+c;
        System.out.println(num);

        return num;
    }
}
