public class ArrayExample2 {
    public static void main(String[] args){
        // int[] scores = new int[5];
        // //それぞれの要素に値を代入
        // scores[0] =50;//添え字（インデックス）の０番目に値５０代入
        // scores[1] = 55;
        // scores[2] = 70;
        // scores[3] = 65;
        // scores[4] = 80;
        int[] scores = {50,55,70,65,80,90};

         for(int i=0; i < scores.length; i++){
            System.out.println(scores[i]);
        }
    }
}
