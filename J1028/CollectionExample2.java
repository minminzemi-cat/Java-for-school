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

public class CollectionExample2 {
    public static void main(String[] args) {
        ArrayList<Point> pointList = new ArrayList<Point>();
        pointList.add(new Point(0,8));
        pointList.add(new Point(1,6));
        pointList.add(new Point(2,9));
        pointList.add(new Point(3,3));


        //⓵pointListに格納されている、すべてのPointオブジェクトに対して、
        //ｘの値とｙの値を入れ替える
        //ラムダ式を使う場合

        System.out.println("swap前");
        pointList.forEach((p)->{
            int tmp = p.y;
            p.y = p.x;
            p.x = tmp;
        });
        
        System.out.println("swap後");
        for(Point p : pointList){
            p.printInfo();
        }

        //pointlistに格納されているPointオブジェクトを
        //ｙの値が大きい順に並べる

        pointList.sort((p0,p1)->p1.y-p0.y);
    }

}
