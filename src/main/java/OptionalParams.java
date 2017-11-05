public class OptionalParams {

    public static String optionalParams(long first) {
        System.out.println(first);
        return "OK! " + first;
    }

    public static String optionalParams(long first, long second) {
        return "OK! " + first + second;
    }

}
