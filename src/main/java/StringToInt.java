public class StringToInt {

    public static int convert_String_To_Number(String numStr) {



        char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';//char 0
        for (char c:ch) {
            int tmpAscii = (int)c;
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        return sum;
    }

    public static int convert_String_To_Number2(String numStr) {
        return numStr.chars().reduce(0, (a, b) -> 10 * a + b - '0');
    }

    public static int convert_String_To_Number3(String numStr) {
        int result = 0;
        for (int i = 0; i < numStr.length(); i++) {
            result = result * 10 + numStr.charAt(i) - '0';
        }
        return result;
    }
    public static void main(String a[]) {
        System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
        System.out.println("\"76289\" == "+convert_String_To_Number2("76289"));
        System.out.println("\"90087\" == "+convert_String_To_Number3("90087"));
    }
}
