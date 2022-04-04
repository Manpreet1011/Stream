import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(34);
        nums.add(11);
        nums.add(87);
        nums.forEach(n-> System.out.println(n));
     //   nums.forEach(System.out::println);
        Consumer<Integer> msg=(n)->{
            System.out.println(n);
        };
        nums.forEach(msg);
    }
}
