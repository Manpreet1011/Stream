public class RunString {
    public static void main(String[] args) {
        StringFunction s = (n) -> n + "!";
        StringFunction d = (n) -> n + "?";
        StringFormatted("Hello",s);
        StringFormatted("Question",d);

    }

@FunctionalInterface
    interface StringFunction {
        String run(String str);
    }

    public static void StringFormatted(String s, StringFunction sf) {
        String str = sf.run(s);
        System.out.println(str);
    }
}
