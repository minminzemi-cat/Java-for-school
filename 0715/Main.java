class Rectangle{
    double width;
    double height;

    //高さと幅を引数で指定できる
    // コンストラクタを追加して下い
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    //面積を戻り値とする
    // インスタンスメソッドを追加してください
    double getArea(){
        return width * height;
    }



//引数で渡されたRectangleオブジェクトと
// 比較して自分の面積のほうが大きければtrueを
//そうでなければfalseを戻り値とする
//インスタンスメソッドを追加せよ
boolean isLarger(Rectangle rectangle){
    //自分自身の面積求める
    double thisArea = this.getArea();

    //引数で渡ってきたRectangleの面積も求める
    double paramArea  = rectangle.getArea();
    //面積を比較
    if(thisArea > paramArea){
    //自分の面積が大きかったらtrue
        return true;
    }else{
        return false;
    }
}
}

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(6, 32);

        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        System.out.println(r1.isLarger(r2));
    }
}
