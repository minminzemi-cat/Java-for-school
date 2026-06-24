
  //StudentCardクラスの宣言
class StudentCard {
    int id;     //学籍番号
    String name;//氏名保存用
}

public class InstanceArrayExample {
    public static void main(String[] args) {
         //インスタンス配列を生成する
        StudentCard[] cards = new StudentCard[3];

        // //インスタンスを生成する
        // cards[0] = new StudentCard();
        // cards[1] = new StudentCard();
        // cards[2] = new StudentCard();

        if(cards[0] != null){
            cards[0].id = 1234;
            cards[0].name = "鈴木太郎";
        }
        
        if(cards[1] != null){
            cards[1].id = 1235;
            cards[1].name = "鈴木太郎";
        
        }
       
        if(cards[2] != null){
            cards[2].id = 1236;
            cards[2].name = "鈴木太郎";
        }


        for(int i = 0; i < 3;i++){
            if(cards[i] == null){
                System.out.println("cards[" + i + " ]は参照がありません");
            }else
            System.out.println("cards[" + i +"]の" +
                "idは" + cards[i].id + 
                ",nameは" + cards[i].name);
        }
        
        
    }
}
  

