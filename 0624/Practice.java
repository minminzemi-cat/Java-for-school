public class Practice {
    //ここに各設問のメソッドを追加する
    // static 戻り値　メソッド名（引数）｛
    //　　　return 戻り値；
    // }
    static double GetTraiangleArea(double height,double base)
    {
        return base * height / 2.0;
    }

    //問１
    static void printHello(int count){
        //引数で渡されてきた値分"Hello"を表示する
        for(int i = 0; i < count; i++){
            System.out.println("hello");
        }
    }

    //問２
    //static 戻り値　・・・
    static double getRectangleArea(double width,double height){
        return width * height;
    }


    //問３
    static String getMessage(String name){
        return "こんにちは" + name + "さん";
    }

    //問４
    static int getAbsoluteValue(int value){
        //絶対値を返す
        //パターン１
        // if(value < 0){
        //     return -value;
        // }else{
        //     return value;
        // }

        //パターン２
        // if(value < 0){
        //     return -value;
        // }

        //パターン３
        //三項演算子
        //   （条件式）？　条件が成立時の値　：　条件が不成立時の値  
        return (value < 0) ? -value :value;

    }


    //問５
    static double getAverage(double a,double b,double c){
        return (a + b + c) / 3 ;
    }

    //問６
    static boolean isSameAbsoluteValue(int i,int j){
        boolean b = getAbsoluteValue(i) ==getAbsoluteValue(j);

        return b;
        // return 3 == 3;
    }

    public static void main(String[] args){
        //練習
        //追加したメソッドを呼び出し、戻り値がある場合には出力する
        //double traiangleArea = GetTraiangleArea(10.0,3.0);
          //  System.out.println(traiangleArea);

          //問１の呼び出し
          //printHello(5);

          //問２の呼び出し
        //   double area = getRectangleArea(5,10);
        //   System.out.println(area);

        //問３の呼び出し
        // String name = getMessage("山田");
        // System.out.println(name);

        //問４の呼び出し
        // int i = getAbsoluteValue(-3);
        // // System.out.println(i);
        // System.out.println(getAbsoluteValue(-3));

        //問５の呼び出し
        //System.out.println(getAverage(1.5, 9.7, 2.0));

        //問６の呼び出し
        System.out.println(isSameAbsoluteValue(3, -3));
    }
}
