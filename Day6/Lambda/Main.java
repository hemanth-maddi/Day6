import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface Authenticate {
    boolean checkCredentials(String username, int password);
}

public class Main {
    public static void main(String[] args) {
        
        Map<String, Integer> userMap = new HashMap<>();
        userMap.put("Pavan", 1090);
        userMap.put("Chakri", 3789);
        userMap.put("Ram", 6666);

       
        Authenticate auth = (username, password) -> {
            if (userMap.containsKey(username) && userMap.get(username) == password) {
                return true;
            } else {
                return false;
            }
        };


        System.out.println(auth.checkCredentials("Pavan",1090));
    }
}
