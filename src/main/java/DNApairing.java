import java.util.ArrayList;

public class DNApairing {
    private static final String sampleArgument = "ACTGGCGTAACGATCTAGATCATTGCGT";

    private DNA getBaseFromLetter(String letter) {
        switch (letter) {
            case ("A"):
                return DNA.ADENINE;
            case ("C"):
                return DNA.CYTOSINE;
            case ("T"):
                return DNA.THYMINE;
            case ("G"):
                return DNA.GUANINE;
            default:
                return null;
        }
    }

    private DNA getPair(DNA base) {
        switch (base) {
            case ADENINE:
                return DNA.THYMINE;
            case THYMINE:
                return DNA.ADENINE;
            case CYTOSINE:
                return DNA.GUANINE;
            case GUANINE:
                return DNA.CYTOSINE;
            default:
                return null;
        }
    }

    private ArrayList<ArrayList<DNA>> pairDNA(String singleStrand) {
        System.out.println("Starting strand: " + singleStrand);

        ArrayList<ArrayList<DNA>> pairedStrand = new ArrayList<ArrayList<DNA>>();
        ArrayList<DNA> pair = new ArrayList<DNA>();

        for (char c:singleStrand.toCharArray()) {
            DNA base = getBaseFromLetter(Character.toString(c));
            DNA pairedBase = getPair(base);
            pair.add(base);
            pair.add(pairedBase);
            pairedStrand.add(new ArrayList<DNA>(pair));
            pair.clear();
        }

        return pairedStrand;
    }

    public void run() {
        System.out.println(pairDNA(sampleArgument));
    }
}
