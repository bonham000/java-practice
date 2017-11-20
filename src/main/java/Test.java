public class Test {
    public boolean test(Object expected, Object result) {
        boolean passed = result.equals(expected);
        if (passed) {
            System.out.println("The test passed!");
        } else {
            System.out.println("The test failed!");
        }
        System.out.println("Expected: \t" + expected);
        System.out.println("Found: \t\t" + result);
        return passed;
    }
}
