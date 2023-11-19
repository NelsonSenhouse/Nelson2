public class Main
{
    public static void main(String[] args)
    {
        Algorithms a = new Algorithms();
        System.out.println(a.numDigits(987654321));
        System.out.println(a.numDigits(9));
        System.out.println(a.isDivisible(9, 3));
        System.out.println(a.isDivisible(100, 6));
        System.out.println(a.oddSum(4, 9));
        System.out.println(a.oddSum(3, 7));
        System.out.println(a.multTenSum(10, 99));
        System.out.println(a.multTenSum(32, 40));
        System.out.println(a.sumDigits(321));
        System.out.println(a.sumDigits(123456789));
        System.out.println(a.powOfTwo(800));
        System.out.println(a.powOfTwo(8));
    }
}
