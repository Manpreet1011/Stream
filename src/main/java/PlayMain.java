import java.util.stream.Stream;

public class PlayMain {
    public static void main(String[] args) {
        Play p= (a, b)-> a.length()>b.length()?a:b;
        System.out.println(p.game("man","abhay"));

        Stream<String> stream = Stream.generate(() -> "Hello Manpreet");
        stream.limit(10).forEach(System.out::println);


    }
        }

