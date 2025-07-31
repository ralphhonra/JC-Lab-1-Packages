package org.example.activity;

public class Main {
    static int staticHex = 6_699;
    static int staticByte = 1;
    static String staticString = "Progress, not perfection";

    int instanceBinary = 45;
    int instanceOctal = 58;
    double instanceDouble = 1_234.95;

    public static void main(String[] args) {
        int localDecimal = 100;
        int localHex = 255;
        int localBinary = 13;
        int localOctal = 12;
        int localLong = 1_000_000;
        String localString  = "Every step I take gets me closer to my goal";

        System.out.println("==================================");
        displayOutput("Static variables", staticHex);
        displayOutput("Static variables", staticByte);
        displayOutput("Static variables", staticString);
        System.out.println("==================================");
        displayOutput("Local variables", localDecimal);
        displayOutput("Local variables", localHex);
        displayOutput("Local variables", localBinary);
        displayOutput("Local variables", localOctal);
        displayOutput("Local variables", localLong);
        displayOutput("Local variables", localString);
        System.out.println("==================================");
        Main main = new Main();
        displayOutput("Instance variables", main.instanceBinary);
        displayOutput("Instance variables", main.instanceOctal);
        displayOutput("Instance variables", main.instanceDouble);
        System.out.println("==================================");
    }

    private static <T> void displayOutput(String type, T input) {
        System.out.println(type + ": " + input.toString());
    }
}
