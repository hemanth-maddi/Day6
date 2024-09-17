import java.util.*;

@FunctionalInterface
interface Factorial {
    int fact(int a);
}

class FactorialNum {
    public static void main(String[] args) {
       
        Factorial l = (x) -> {
            int result = 1;
            for(int i=1; i<=x;i++){
                result*=i;
            }

            return result;
        };

        int result = l.fact(10);
        System.out.println(result);
    }
}
