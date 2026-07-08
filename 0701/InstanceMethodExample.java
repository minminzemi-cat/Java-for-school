class StudentCard {
    static int counter =0;
    //フィールド
      int id;     //学籍番号
    String name;//氏名保存用


    //コンストラクタ
    StudentCard(int id,String name){
        this.id  = id;
        this.name = name;
        StudentCard.counter++;
    }



    //クラスメソッド
    //三角形の面積を戻り値で返す
    static double getTraiangleArea(double base, double height){
        return base * height /2.0;
    }





    //インスタンスメソッド
    void printInfo(){
        System.out.println("学籍番号："+this.id);
        System.out.println("氏名"+this.name);
        }
}

public class InstanceMethodExample {
    public static void main(String[] args) {
        System.out.println("この時点でのインスタンスの数"+StudentCard.counter);
        StudentCard a = new StudentCard(1234,"鈴木太郎");
                System.out.println("この時点でのインスタンスの数"+StudentCard.counter);
        StudentCard b = new StudentCard(1235, "佐藤花子");
                System.out.println("この時点でのインスタンスの数"+StudentCard.counter);
        // a.printInfo();
        // b.printInfo();
        double area =StudentCard.getTraiangleArea(10, 5);
        System.out.println("三角形の面積は"+StudentCard.getTraiangleArea(10,5));

    }
    
}
