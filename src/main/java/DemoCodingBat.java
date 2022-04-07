import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoCodingBat {
    public static void main(String[] args) {
        String str[] = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String str1[] = firstSwap(str);
        for (String s : str1)
            System.out.println(s);
//        for (Map.Entry<String, String> m : map.entrySet()) {
//            System.out.println(m.getKey() + " of " + m.getValue());
//        }


    }


    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();
        int l = strings.length;
        map.put(strings[0].substring(0, 1), 0);
        for (int x = 1; x < strings.length; x++) {

            if ((map.containsKey(strings[x].substring(0, 1))) && (map.get(strings[x].substring(0, 1)) != l)) {
                String s = strings[x];
                strings[x] = strings[map.get(strings[x].substring(0, 1))];
                strings[map.get(strings[x].substring(0, 1))] = s;
                map.put(strings[x].substring(0, 1), l);
            } else {
                if (!(map.containsKey(strings[x].substring(0, 1)))) {


                    map.put(strings[x].substring(0, 1), x);
                }
            }
        }
        return strings;
    }

}
