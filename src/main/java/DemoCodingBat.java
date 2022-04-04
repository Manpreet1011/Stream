import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoCodingBat {
    public static void main(String[] args) {
       // List<Integer> names= List.of(1,2,3);
        String[] str={"a", "b", "c", "a"};;
        str=wordsWithout(str, "a");
        for(String s:str)
        System.out.println(s);
    }
    public static String[] wordsWithout(String[] words, String target) {
       return Arrays.stream(words).filter(s->!s.equals(target)).toArray(String[]::new);
    }

}
