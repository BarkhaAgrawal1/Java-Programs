
import java.util.*;
public class Ami_Hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Black");
        map1.put(2, "Green");
        Iterator it = map1.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String>set = (Map.Entry<Integer,String>)it.next();
            System.out.println(set.getKey()+ " " +set.getValue());
        }

        }
    }




