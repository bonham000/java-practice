
public class Algorithm {

    public void run() {
        System.out.println("Running...");
        MalwareExtraction me = new MalwareExtraction();

        me.getTerms().stream().forEach(t -> System.out.println(t.toString()));

    }

}