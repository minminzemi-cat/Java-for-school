public class Main {
    public static void main(String[] args){
        //hello();
        int start = 10;
        int end = 5;
        countdown(start,end);
    }

    //countdonwメソッドを自作する
    public static void countdown(int start,int end){
        System.out.println("カウントダウンします");
        for(int i = start;i >= 0;i--){
            System.out.println(i);
        }
        hello();
    }

    //Hello メソッドを自作
    public static void hello(){
        //処理
        System.out.println("Hello world");
    }
    
}
