//ArmStrong number is a number that is equal to the sum of its digits raised to the power of number of digits.ex.:-

import java.util.Scanner;

class Question14
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check it is ArmStrong number or not");
        int n=sc.nextInt();
        boolean result=isArmStrongNumber(n);
        if(result)
        {
            System.out.println(n+" is ArmStrong Number.");
        }
        else
        {
            System.out.println(n+" is not ArmStrong Number.");
        }
    }

    public static boolean isArmStrongNumber(int n)
    {  int original=n; int sum=0;
        int countdigit=countdigit(n);
        for(;n>0;n=n/10)
        {
            int digit=n%10;
            sum=sum+getPower(digit,countdigit);
        }
        return original==sum;
        
    }
    public static int countdigit(int n)
    { 
        int count=0;
        for(;n>0;n=n/10)
        {
            int digit=n%10;
            count++;
        }
        return count;
    }
    public static int getPower(int a,int b)
    { int power=1;
        for(int i=1;i<=b;i++)
        {
            power=power*a;
        }
        return power;
    }

}
