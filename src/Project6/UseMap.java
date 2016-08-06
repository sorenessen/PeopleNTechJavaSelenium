package Project6;

import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Created by soren on 8/6/2016.
 */
public class UseMap {
    public static void main(String[] args) {
      Map<String, String> map = new LinkedHashMap<String, String>();
       map.put("USA", "NY");
        map.put("UK", "London");
        map.put("Japan", "Tokyo");
        map.put("Kosovo", "Pristina");
        map.put("Canada", "Ontario");
        map.put("Bangladesh", "Dhaka");

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : " + entry.getValue());
        }

    }
}
