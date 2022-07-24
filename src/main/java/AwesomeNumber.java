public class AwesomeNumber {
    int aNum;
    public AwesomeNumber(int i) {
        aNum = i;
    }


    public static int add(AwesomeNumber n1, AwesomeNumber n2) {
        return n1.aNum + n2.aNum;
    }

    public static int subtract(AwesomeNumber n1, AwesomeNumber n2) {
        return n1.aNum - n2.aNum;
    }
}
