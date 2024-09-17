import java.util.*;

class arrayList{
    public static HashMap<Integer,Integer> getSquares(int[] arr){

        HashMap<Integer,Integer> squares = new HashMap<>();

        for(int i : arr){
            squares.put(i, i*i);
        }

        return squares;
    }
        public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        HashMap<Integer , Integer> result  = new HashMap<>();
        result = getSquares(arr);
        System.out.println(result);
    }
}




