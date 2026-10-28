package J1028;

import  java.util.ArrayList;

class Point{
    //フィールド変数
    int x;
    int y;


    //コンストラクタ
    Point(int x,int y){
        this.x = y;
        this.y = y;
    }

    //メソッド
    void printInfo(){
        System.out.println("(" + this.x + "," + this.y + ")");
    }
}

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<Point> pointList = new ArrayList<Point>();
        pointList.add(new Point(0,8));
        pointList.add(new Point(1,6));
        pointList.add(new Point(2,9));
        pointList.add(new Point(3,3));

        //   変数　　：　コレクション
        // for(Point p : pointList){
        //     //もともと入っているデータに＊２して再代入
        //     p.x = p.x * 2;
        //     p.y *= 2;

        // }
        //forEachをラムダ式で
        //pointList.forEach(p -> {p.x *= 2; p.y *= 2});

        //ラムダ式で表現すると
        //（引数）->｛処理｝
        //p -> { p.x *=2,p.y * 2;};

        // for(Point p : pointList){
        //     p.printInfo();
        // }
        //(Point p) -> { p.printInfo();};

        //ラムダ式の省略形
        // p -> { p.printInfo();};

        pointList.forEach(p -> p.printInfo());


    }

}
