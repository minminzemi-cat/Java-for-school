public class Main {
    public static void main(String[] args){
        //インスタンスを生成する
        StudentCard studentCard = new StudentCard();
        //インスタンスにデータを流し込む
        studentCard.id = 12345;
        studentCard.name = "清風太郎";

        StudentCard studentCard2 = new StudentCard();
        studentCard2.id = 6789;
        studentCard2.name="花子";
    }
}
