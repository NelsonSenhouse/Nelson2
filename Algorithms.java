import static java.lang.Math.pow;

public class Algorithms
{
//  4.1 Algorithms
    public int numDigits(int x) {
        int digits = 1;
        for (int i = 0; Math.pow(10, i) <= x; i++)
        {
            digits = i + 1;
        }
        return digits;
    }
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
    public int sumDigits(int x)
    {
        int sum = 0;
        while(x > 0)
        {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
    public int powOfTwo(int x)
    {
        int i = 0;
        while(pow(2, i) <= x)
        {
            i ++;
        }
        return (int) pow(2, i - 1);
    }
    public int onesDigit(int x)
    {
        return x % 10;
    }
    public int removeOnes(int x)
    {
        return x / 10;
    }
    public int numEvenDigits(int x)
    {
        int count = 0;
        while(x > 0)
        {
            if ((x % 10) % 2 == 0)
            {
                count ++;
            }
            x /= 10;
        }
        return count;
    }
//  4.3 Algorithms
    public boolean isSecString(String str, String secStr)
    {
        if (str.indexOf(secStr) != -1)
        {
            return true;
        }
        return false;
    }
    public String reverseWord(String str)
    {
        String revWord = "";
        for(int i = 1; i <= str.length(); i++)
        {
            revWord += str.substring(str.length() - i, str.length() - (i - 1));
        }
        return revWord;
    }
    public boolean isPalindrome(String str)
    {
        String revWord = "";
        for(int i = 1; i <= str.length(); i++)
        {
            revWord += str.substring(str.length() - i, str.length() - (i - 1));
        }
        return revWord.equals(str);
    }
    public int secInFirst(String str, String secStr)
    {
        int count = 0;
        for(int i = 0; i <= str.length() - secStr.length(); i ++)
        {
            if(secStr.equals(str.substring(i, i + secStr.length())))
            {
                count ++;
            }
        }
        return count;
    }
}
