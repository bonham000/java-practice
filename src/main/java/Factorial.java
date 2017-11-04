public class Factorial {
    private Integer breakValue = 1;
    public Integer factorial(Integer limit) {
        if (limit > breakValue) {
            return limit * factorial(limit - 1);
        }
        return limit;
    }
}
