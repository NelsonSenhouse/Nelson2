public class Main
{
    public static void main(String[] args)
    {
        Algorithms a = new Algorithms();
//      # of digits
        System.out.println(a.numDigits(987654321));
        System.out.println(a.numDigits(9));
        System.out.println();
//      two params are divisible
        System.out.println(a.isDivisible(9, 3));
        System.out.println(a.isDivisible(100, 6));
        System.out.println();
//      sum of odd #'s
        System.out.println(a.oddSum(4, 9));
        System.out.println(a.oddSum(3, 7));
        System.out.println();
//      sum of mults of 10
        System.out.println(a.multTenSum(10, 99));
        System.out.println(a.multTenSum(32, 40));
        System.out.println();
//      sum of digits
        System.out.println(a.sumDigits(321));
        System.out.println(a.sumDigits(123456789));
        System.out.println();
//      pow of 2 <= param
        System.out.println(a.powOfTwo(800));
        System.out.println(a.powOfTwo(8));
        System.out.println();
//      ones digit
        System.out.println(a.onesDigit(987654321));
        System.out.println(a.onesDigit(2222223));
        System.out.println();
//      param ones digit truncated
        System.out.println(a.removeOnes(987654321));
        System.out.println(a.removeOnes(95));
        System.out.println();
//      # even digits
        System.out.println((a.numEvenDigits(123456789)));
        System.out.println((a.numEvenDigits(13579)));
    }
}
