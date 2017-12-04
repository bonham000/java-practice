public class AddTogether {

    interface addFn<Integer> {
        public Integer add(Integer b);
    }

    public Integer addTogether(Integer a, Integer b) {
        return a + b;
    }

    public addFn<Integer> addTogether(Integer a) {
        return new addFn<Integer>() {
            @Override
            public Integer add(Integer b) {
                return a + b;
            }
        };
    }

    public void run() {
        System.out.println("Running...");
        System.out.println(addTogether(5, 10));
        System.out.println(addTogether(27, 42));
        addFn fn = addTogether(11);
        System.out.println(fn.add(14));
    }
}
