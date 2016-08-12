package dataStructure;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
/**
 * Created by soren on 8/6/2016.
 */
public class UseListMap {
    public static void main(String[] args) {
        List<String> citiesOfUSA = new ArrayList<String>();
        citiesOfUSA.add("NY");
        citiesOfUSA.add("CO");
        citiesOfUSA.add("SF");

        List<String> citiesOfCanada = new ArrayList<String>();
        citiesOfCanada.add("Ontario");
        citiesOfCanada.add("Montreal");
        citiesOfCanada.add("Nova Scotia");

        List<String> citiesOfBangladesh = new ArrayList<String>();
        citiesOfBangladesh.add("Dhaka");
        citiesOfBangladesh.add("Comilla");
        citiesOfBangladesh.add("Sylhet");

        List<String> citiesOfUK = new ArrayList<String>();
        citiesOfUK.add("London");
        citiesOfUK.add("Kent");
        citiesOfUK.add("Manchester");

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        map.put("USA", citiesOfUSA);
        map.put("UK", citiesOfUK);
        map.put("Canada", citiesOfCanada);
        map.put("Bangladesh", citiesOfBangladesh);

        for(Map.Entry<String, List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());

        }

        System.out.println("....Retrieve the values by Iterator and While Loop...");
        Iterator it = map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry data = (Map.Entry)it.next();
                System.out.println(data.getKey() + " " + data.getValue());
            }

    }

}
