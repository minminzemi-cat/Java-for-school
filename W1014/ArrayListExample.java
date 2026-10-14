package W1014;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        String[] months = new String[10];
        

        ArrayList<String> months = new ArrayList<String>();
        months.add("january");
        months.add("February");
        months.add("March");

        months.remove(1);
        System.out.println("要素数  ：" + months.size());
        for(int i = 0; i < months.size(); i++){
            System.out.println(months.get(i));
        }
    }
}
