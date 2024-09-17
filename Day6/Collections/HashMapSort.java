import java.util.*;

class HashMapSort{
    public static List<Integer> getValues (HashMap<Integer, Integer> map){
        List<Integer> values = new ArrayList<Integer> (map.values());
        Collections.sort(values);
        return values;
    }
    public static void main(String[] args){
        HashMap<Integer , Integer> n = new HashMap<Integer , Integer>();
        n.put(1, 57);
        n.put(2, 89);
        n.put(3, 91);
        n.put(4, 33);
        n.put(5, 11);
        List<Integer> result= new ArrayList<Integer>();
        result = getValues(n);
        System.out.println(result);
    }
}