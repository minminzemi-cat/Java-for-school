//StudentCardクラスの宣言
class StudentCard {
    int id;     //学籍番号
    String name;//氏名保存用
}

public class InstanceExample {
    public static void main(String[] args) {
         //インスタンスを生成する
        
        StudentCard studentCard2 = new StudentCard();
        StudentCard studentCard3 = studentCard2;

        //インスタンスにデータを流し込む
        
        studentCard2.id = 1235;
        studentCard2.name="佐藤花子";

        
        System.out.println("二人目のidの値は"+ studentCard2.id);
        System.out.println("二人目の名前は" + studentCard2.name);
        
        System.out.println("二人目のidの値は"+ studentCard3.id);
        System.out.println("二人目の名前は" + studentCard3.name);

        studentCard3.id = 7777;
        studentCard3.name ="林次郎";
    }
}

