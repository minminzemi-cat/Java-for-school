
class StudentCardEx {
      int id;     //学籍番号
    String name;//氏名保存用


    //コンストラクタ
    StudentCardEx(){
        System.out.println("引数のないコンストラクタが実行されました");
        this.id =0;
        this.name = name;
    }

    //
    StudentCardEx(String name){
        System.out.println("引数が一つのコンストラクタが実行されました");

    }



    StudentCardEx(int id,String name){
        System.out.println("StudentCardクラスのコンストラクタが呼び出されました");
        this.id = id;
        this.name = name;
        
    }
}

public class ConstructorExample {

    public static int add(int x,int y){
        return x+y;
    }

    public static int add(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        StudentCardEx sc1 = new StudentCardEx();
         System.out.println("sc1のidの値は" + sc1.id);
        System.out.println("sc1のnameの値は" + sc1.name);


             StudentCardEx sc2 = new StudentCardEx("鈴木");
         System.out.println("aのidの値は" + sc2.id);
        System.out.println("aのnameの値は" + sc2.name);


        StudentCardEx a = new StudentCardEx(1234, "鈴木太郎");
        System.out.println("aのidの値は" + a.id);
        System.out.println("aのnameの値は" + a.name);

        StudentCardEx b = new StudentCardEx(777, "清風太郎");
             System.out.println("bのidの値は" + b.id);
        System.out.println("bのnameの値は" + b.name);
    }
}
