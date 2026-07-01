  //StudentCardクラスの宣言
class StudentCard {
    int id;     //学籍番号
    String name;//氏名保存用
}

public class ReferneceExample {
    static void printCardInfo(StudentCard card){
        //めそっどぉ作っていく
        //インスタンスのメンバ変数の情報を表示
        System.out.println("学籍番号:" + card.id);
        System.out.println("氏名：" + card.name);

    }

    //インスタンスのメンバ変数の情報を初期化する
    static void clearCardInfo(StudentCard card){
        card.id = 0;
        card.name ="未定";
    }

    static StudentCard compareCards(StudentCard card0,StudentCard card1){
        if(card0.id < card1.id){

        }
    }

    public static void main(String[] args) {
        //studentcardが使えるようにするために
        //インスタンス化する
        StudentCard card0 = new StudentCard();
        card0.id = 1234;
        card0.name="鈴木太郎";

        StudentCard card1 = new StudentCard();
        card1.id = 9999;
        card1.name="鈴木太郎";

        StudentCard resultCard = null;
        resultCard=compareCards(card0, card1);
        printCardInfo(resultCard);

        printCardInfo(card0);
        clearCardInfo(card0);
        printCardInfo(card0);
    }
}
