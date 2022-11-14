package Arrays.mimi.com;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("msg","hello");
        map.put("count",123);
        map.put("name","heaven");

        String message  = (String) map.get("msg");
        int count  = (Integer)map.get("count");
        String name = (String)map.get("name");

        System.out.println(name);
        System.out.println(count);
        System.out.println(message);
    }

}
