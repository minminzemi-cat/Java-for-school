public class Dowhile {
    public static void main(String[] args){
        int i =0;

        do{
            System.out.println("こんにちは"+ i +"回目");
            i++;
        }while(i<5);

        for(int j=0;j<5;j++){
            System.out.println("こんにちは"+ j +"回目");
        }

        int k=0;
        while(k <5){
            System.out.println("こんにちは"+ k +"回目");
            k++;
        }
    }
}
