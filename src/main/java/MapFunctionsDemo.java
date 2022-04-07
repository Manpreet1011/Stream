import java.util.*;

public class MapFunctionsDemo{
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>();
        m.put("Manpreet",100);
        m.put("Abhay",200);
        m.put("Param",120);
        m.put("Armaan",230);
        m.put("Yashmeen",139);
        System.out.println(m);
        System.out.println(m.put("Param",500));
        Set s=m.keySet();
        System.out.println(s);
        Set<Map.Entry<String, Integer>> entries = m.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<String, Integer>> itr= entries.iterator();
        m.forEach((key,value)->{
            System.out.println(key +"  is   "+value);
        });
        for(String z: m.keySet())
            System.out.println(z  +"   hi " + m.get(z));

        while(itr.hasNext())
        {
            Map.Entry  mm=(Map.Entry) itr.next();
            System.out.println(mm.getKey()+"   hello   "+mm.getValue());
        }
        //System.out.println();


    }
}
