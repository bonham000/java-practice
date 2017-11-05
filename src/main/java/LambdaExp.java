
interface Runner {
    void run(String name, int days);
}

class Exec {
    public void execute(Runner r) {
        r.run("Jim", 0);
    }
}

public class LambdaExp {
    public static void main(String[] args) {
        System.out.println("Starting...");

        Exec x = new Exec();
        x.execute((s, d) -> {
            System.out.println("Lamdaing: ");
            System.out.println(s);
            System.out.println("Days Left: " + d);
        });
    }
}
