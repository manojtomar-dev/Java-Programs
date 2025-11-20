import java.util.Scanner;

class Question6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check wheather it is palindrome number or not");
        int n=sc.nextInt();
        boolean result=isPalindrome(n);
        if(result)
        {
            System.out.println(n+" is Palindrome number");
        }
        else
        System.out.println(n+" is not Palindrome number");
    }
    public static boolean isPalindrome(int n)
    { int original=n; int rev=0;
        for(;n>0;n=n/10)
        {
            int digit=n%10;
             rev=rev*10 + digit;
        }
        if(rev==original)
        {
            return true;
        }
        return false;
    }

}