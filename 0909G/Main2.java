import java.lang.String;
public class Main2{
    public static void main(String[] args) {
        String s1 = new String("こんにちは");
        String s2 = new String("こんにちは");

        if(s1==s2){
            System.out.println("同じ値");

        }
        else{
            System.out.println("異なる値");
        }

        String s3 = "おはよう123";
        String s4 = "おはよう123";

        if(s3.equals(s4)){
            System.out.println("同じ値");
            System.out.println(s3.length());
            System.out.println(s3.indexOf("123"));
            System.out.println(s3.contains("こんにちは"));
            System.out.println(s3.replace("おはよう", "こんにちは"));
        }
        else{
            System.out.println("異なる値");
        }


        String str5 ="2026/09/09";
        String[] items = str5.split("/");
        for(int i = 0;i<items.length;i++){
            System.out.println(items[i]);
        }

        System.out.println(Math.abs(-9.5));
        System.out.println(Math.PI);
    }
}