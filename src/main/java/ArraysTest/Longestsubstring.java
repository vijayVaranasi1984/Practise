package ArraysTest;

public class Longestsubstring {

    static void generateString(int A, int B, int C)

            //If occurrence(a) > occurrence(b) then append “aab”
    //If occurrence(b) > occurrence(a) then append “bba”
    //If occurrence(a) = occurrence(b) then append “ab”
    {
        String result = "";
        while (0 < A || 0 < B || 0 < C)
        {
            System.out.println("A " +A );
            System.out.println("B " +B );
            System.out.println("C " +C );
         System.out.println(A < B);
         System.out.println(B < A);
         System.out.println(C < A);
            if (A < B)
            {
                System.out.println("INSIDe 1");
                if (0 < B--)
                {
                    result += ('b');
                }
//                if (0 < B--)
//                {
//                    result += ('b');
//                }
                if (0 < A--)
                {
                    result += ('a');
                }
                if (0 < C--)
                {
                    result += ('c');
                }
            }

            else if (B < A)
            {
                System.out.println("INSIDe 2");
                if (0 < A--)
                {
                    result += ('a');
                }
                if (0 < A--)
                {
                    result += ('a');
                }
                if (0 < B--)
                {
                    result += ('b');
                }
                if (0 < C--)
                {
                    result += ('c');
                }
            }

            else if (C < A)
            {
                System.out.println("INSIDe 3");
                if (0 < A--)
                {
                    result += ('a');
                }
                if (0 < A--)
                {
                    result += ('a');
                }
                if (0 < C--)
                {
                    result += ('c');
                }
                if (0 < B--)
                {
                    result += ('b');
                }
            }


            else
            {
                if (0 < A--)
                {
                    result += ('a');
                }
                if (0 < B--)
                {
                    result += ('b');
                }
                if (0 < C--)
                {
                    result += ('C');
                }

            }
        }
        System.out.println(result);
    }

    // Driver code
    public static void main(String[] args)
    {
        int A = 4, B = 3, C= 1;
        generateString(A, B,C);
    }
}
