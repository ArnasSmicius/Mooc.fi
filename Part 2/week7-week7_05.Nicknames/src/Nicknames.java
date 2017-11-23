
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>();
        members.put("matti", "mage");
        members.put("mikael", "mixu");
        members.put("arto", "arppa");
        System.out.println(members.get("mikael"));
        // Do the operations requested in the assignment here!
    }

}
