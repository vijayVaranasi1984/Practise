//from Amit to everyone:    10:19 AM
//Given following three values, the task is to find the total number of maximum chocolates you can eat.
//
//money : Money you have to buy chocolates 16
//price : Price of a chocolate 2
//wrap : Number of wrappers to be returned for getting one extra chocolate. 2 wrapper
//It may be assumed that all given values are positive integers and greater than 1.

public class Test {

    public static void main(String[] args){

//        int money =16;
//        int price=2;
//
//        int wrap = 0;
//
//
//        calculateExtraWrapper(money,wrap,price);

        String str ="qwerty".toLowerCase();

        System.out.println("is palindrome " + ispalindrome(str));






    }

    private static boolean ispalindrome(String str) {

        int i=0;
        int j=str.length()-1;
        while(i<j){

                if((str.charAt(i) != str.charAt(j)) && str == " "){
                    return false;
                }
          i++;
          j--;
        }
        return true;
    }

//    private static void calculateExtraWrapper(int money, int wrap, int price) {
//
//        int noOfChocEaten = money/price;
//
//
//        calculateExtraWrapper(money,wrap,price);
//
//    }
}
