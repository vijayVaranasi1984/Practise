public class revesseStringWithoutfor {

    static String reverse(String str) {
        if(str.length() == 0)
            return "";
        return str.charAt(str.length() - 1) +    reverse(str.substring(0,str.length()-1));
    }
    public static void main(String[] args)
    {
        String str ="vijay";
        System.out.println(reverse(str));

    }

}
