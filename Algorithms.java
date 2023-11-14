public class Algorithms
{
//    public int numDigits(int x)
//    {
//
//    }
    public boolean isDivisible(int x, int y)
    {
        if(x % y == 0)
        {
            return true;
        }
        return false;
    }
    public int oddSum(int x, int y)
    {
        int sum = 0;
        int i = x;
        while(i <= y)
        {
            if(i % 2 == 1)
            {
                sum += i;
            }
            i ++;
        }
        return sum;
    }
    public int multTenSum(int x, int y)
    {
        int sum = 0;
        int i = x;
        while(i <= y)
        {
            if(i % 10 == 0)
            {
                sum += i;
            }
            i ++;
        }
        return sum;
    }
    public int powOfTwo(int x)
    {
        int i = 0;
        while(Math.pow(2, i) <= x)
        {
            i ++;
        }
        return (int)Math.pow(2, i - 1);
    }
}
