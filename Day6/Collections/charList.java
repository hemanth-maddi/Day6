import java.util.*;

class charList{

    public static HashMap<Character, Integer> countChars(char[] arr){
        HashMap<Character , Integer> counts = new HashMap<Character, Integer>();
        for(char i : arr){
            if(counts.containsKey(i)){
                counts.put(i, counts.get(i) + 1);
            }
            else{
                counts.put( i,1 );
            }
            
        }
        return counts;
    }
    public static void main(String[] args){

        char[] n= {'a','a','a','c','b','d','c','r','y','u','u','d'};
        HashMap<Character, Integer> result = new HashMap<>();

        result= countChars(n);
        System.out.println(result);
    }
}