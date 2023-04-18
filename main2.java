import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main2 {
    public static void main(String[] args) {
        String str = "Alexx9800";
        String[] subStr;
        String delimeter = "";
        HashSet<String> res = new HashSet<>();
        subStr = str.split(delimeter);

        for (int i = 0; i < subStr.length; i++) {
            res.add(subStr[i]);
        }
        String[] ress = res.toArray(new String[0]);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(ress[i]);
        }
    }
}
