package J1028;

public class Sample {
    public static void main(String[] args) {
        String num_str ="a";

        try{
            int num = Integer.parseInt(num_str);
            System.out.println(num + 10);
        }catch(NumberFormatException e){

        }
    }
}
