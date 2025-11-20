//A number equal to the sum of factors of its digit.ex:- 145= 1!+ 4! + 5! =1+24+120=145.

import java.util.Scanner;

class Question12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check it is Strong number or not");
        int n=sc.nextInt();
        boolean result=isStrongNumber(n);
        if(result)
        {
            System.out.println(n+" is Strong Number.");
        }
        else
        {
            System.out.println(n+" is not Strong Number.");
        }
    }

    public static boolean isStrongNumber(int n)
    { int sum=0; int original=n;
        for(;n>0;n=n/10)
        {
            int digit=n%10;
            sum=sum+ getafact(digit);
        }
        if(sum==original)
        {
            return true;
        }
        return false;
    }

    public static int getafact(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
