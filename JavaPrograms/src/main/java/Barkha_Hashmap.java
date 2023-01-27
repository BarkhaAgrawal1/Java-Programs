
import java.util.*;
public class Barkha_Hashmap {

    public static void main(String[] args) {
        HashMap<Integer, Integer> ma = new HashMap<>();
        ma.put(1, 2);
        ma.put(3, 4);
for (Map.Entry m: ma.entrySet()){
    System.out.println(m.getKey() + " "+ m.getValue());
}
        Iterator it = ma.entrySet().iterator();
while (it.hasNext()){
    Map.Entry<Integer,Integer>set = (Map.Entry<Integer,Integer>)it.next();
    System.out.println(set.getKey()+ " "+ set.getValue());
        }


    }
}
//for each loop will also iterate and iterator with while will also iterate so no nee to use both of them
//Map.Entry interface contains get key and get value method ,
// entry.set contains the entry in the hashmap in the form of collection that why we call
//for(Map.Entry m = ma.entryset())
// HashMap have key and value but HashSet have only value.
