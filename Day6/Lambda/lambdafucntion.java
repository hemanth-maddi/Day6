import java.util.*;

@FunctionalInterface
interface Lambda{
    int Power(int a, int b);
}
public class lambdafucntion{
    public static void main(String[] args){
        Lambda l=(x,y)->(int) Math.pow(x,y);
        int result= l.Power(5,6);
        System.out.println(result);
    }

}
