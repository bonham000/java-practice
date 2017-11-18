public class MissingCharacter {

    private static final String sampleArgument = "abcdefghijklmnopqrstuvwxylz";

    private void findMissingCharacter(String string) {
        char missingCharacter = 0;
        char[] charString = string.toCharArray();
        char first = charString[0];
        char next = (char) ((int) first);
        for (char c:charString) {
            if (c != next) {
                missingCharacter = next;
            } else {
                next = (char) ((int) c + 1);
            }
        }

        if (missingCharacter == 0) {
            System.out.println("String is in order!");
        } else {
            System.out.println("Missing Character: " + missingCharacter);
        }

    }

    public void run() {
        System.out.println("Running...");
        findMissingCharacter(sampleArgument);
    }

}
