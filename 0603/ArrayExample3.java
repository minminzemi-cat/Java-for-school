public class ArrayExample3 {
    public static void main(String[] args){
        //2次元配列
        //int [][] socres;
        //socres =new int[3][5]

        int [][] scores = {
            {50,55,70,65,80},   //[0]2026年度のAさんの成績
            {60,77,90,73,55},   //[1]2025年度のAさんの成績
            {66,85,76,95,98}    //[2]2024年度のAさんの成績
        };

        System.out.println(scores.length);
        System.out.println(scores[0].length);

        for(int i = 0; i< scores[0].length;i++){
            for(int j = 0;j < scores[i].length; j++){
                System.out.println(scores[i][j] + "  ");
            }
            System.out.println( "");
        }
    }
}
