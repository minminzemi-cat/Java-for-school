package J1014;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,String> map  = new HashMap<String,String>();

        map.put("first name","太郎");

        //System.out.println(map.entrySet());
        //System.out.println(map.values());
        //System.out.println(map.keySet());
        System.out.println(map.get("first name"));
    }
}
