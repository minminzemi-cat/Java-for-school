
class StudentCardEx {
      int id;     //学籍番号
    String name;//氏名保存用

    StudentCardEx(int id,String name){
        System.out.println("StudentCardクラスのコンストラクタが呼び出されました");
        this.id = id;
        this.name = name;
        
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        StudentCardEx a = new StudentCardEx(1234, "鈴木太郎");
        System.out.println("aのidの値は" + a.id);
        System.out.println("aのnameの値は" + a.name);
    }
}
