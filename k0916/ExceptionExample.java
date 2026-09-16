package k0916;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("Cの値は" + c);
        }
        catch(ArithmeticException e){
            System.out.println("例外をキャッチしました");
            System.out.println(e);
            return;
        }
        finally{
            System.out.println("finallyブロックの処理です");
        }
        
        System.out.println("プログラムを終了します");

        // int[] scores = new int[3];
        // scores[0]=50;
        // scores[1]=55;
        // scores[2]=90;
        // scores[3]=20;
    }
}
