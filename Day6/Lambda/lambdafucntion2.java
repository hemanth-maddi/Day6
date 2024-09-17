import java.util.*;

@FunctionalInterface
interface Lambda {
    String Space(String a);
}

public class lambdafucntion2 {
    public static void main(String[] args) {
        Lambda l = (x) -> {
            StringBuilder spacedString = new StringBuilder();
            for (int i = 0; i < x.length(); i++) {
                spacedString.append(x.charAt(i)).append(" ");
            }
            return spacedString.toString().trim(); 
        };

            String result = l.Space("CG");

        
        System.out.println(result);  
    }
}
