public class BinaryAgent {

    private static final String binary1 = "01000001 01110010 " +
            "01100101 01101110 00100111 01110100 00100000 " +
            "01100010 01101111 01101110 01100110 01101001 " +
            "01110010 01100101 01110011 00100000 01100110 " +
            "01110101 01101110 00100001 00111111";

    private static final String binary2 = "01001001 00100000 " +
            "01101100 01101111 01110110 01100101 00100000 " +
            "01000110 01110010 01100101 01100101 01000011 " +
            "01101111 01100100 01100101 01000011 01100001 " +
            "01101101 01110000 00100001";

    private String binaryAgent(String binary) {

        String[] binaries = binary.split(" ");

        String result = "";

        for (String s:binaries) {
            int tempCharCode = Integer.parseInt(s, 2);
            result += (char) tempCharCode;
        }

        return result;
    }

    public void run() {
        System.out.println("Running...");
        System.out.println(binaryAgent(binary1));
        System.out.println(binaryAgent(binary2));
    }
}
