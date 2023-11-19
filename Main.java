public class Main
{
    public static void main(String[] args)
    {
        Algorithms a = new Algorithms();
//      second param is in first
        System.out.println(a.isSecString("Hello World!", "o W"));
        System.out.println(a.isSecString("AP CSA", "CSP"));
        System.out.println();
//      reverses param
        System.out.println(a.reverseWord("gohangasalami"));
        System.out.println(a.reverseWord("hello world"));
        System.out.println();
//      if param is palindrome
        System.out.println(a.isPalindrome("amanaplanacanalpanama"));
        System.out.println(a.isPalindrome("monday"));
        System.out.println();
//      # of sec param in first
        System.out.println(a.secInFirst("Mississippi", "si"));
        System.out.println(a.secInFirst("sspsyehsususssssssssuhuhuhuhueoejsspsphsssss", "s"));
    }
}
