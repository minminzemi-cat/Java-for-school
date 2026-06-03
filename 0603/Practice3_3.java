public class Practice3_3 {
    public static void mani(String[] args){
        
        int sum =0;
        //10から２０までの和

        for(int i = 10 ; i<=20;i++){
            sum += i;
        }
        System.out.println("答えは"+sum);

        sum = 0;
        int i = 10;

        while(i <=20){
            sum +=i;
            i++;
        }
    }    
}
