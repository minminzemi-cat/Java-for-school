
  //StudentCardクラスの宣言
class StudentCard {
    int id;     //学籍番号
    String name;//氏名保存用
}

public class nullExample {
    public static void main(String[] args) {
         //インスタンス配列を生成する
        StudentCard[] cards = new StudentCard[3];

        // //インスタンスを生成する
         cards[1] = new StudentCard();
         cards[1].id = 1235;//インスタンスのメンバー変数idに1235を代入

         cards[1].name="佐藤";

         cards[0] = new StudentCard();
         cards[0].id = 111;

         for(int i = 0; i<3;i++){
            if(cards[i]==null){
                System.out.println("cards[" + i + "]は参照がありません");
            }else{
                System.out.println("cards["+ i +"]のidは" + cards[i].id +
                "、nameは" + cards[i].name);
            }
         }
        
        
    }
}
  

