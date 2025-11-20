import java.util.Scanner;

class Question1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check it is prime or not");
        int n=sc.nextInt();
        boolean result=isPrime(n);

        if(result)
        {
            System.out.println(n+" is Prime Number");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }
    }

    public static boolean isPrime(int n)
    {
        if(n<2)
        return false;
        if(n==2||n==3)
        return true;
        if(n%2==0)
        return false;
        if(n>3)
            {for(int i=3;i<=Math.sqrt(n);i+=2)
                {
                if(n%i==0)
                {
                    return false;
                }
                }
            }
        return true;

    }
}