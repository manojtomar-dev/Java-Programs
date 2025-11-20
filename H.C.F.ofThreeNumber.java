import java.util.Scanner;

class Question23
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the first number :");
        int a=sc.nextInt();
        System.out.println("Enetr the second number :");
        int b=sc.nextInt();

        int result=getHCF(a,b);

        System.out.println("The HCF of two number is : "+result);
    
    }

    public static int getHCF(int a,int b)
    {
        int min=getMIn(a,b);

        for(int i=min;;i--)
        {
            if(a%i==0&&b%i==0)
            {
            return i;
            }
        }

    }
    public static int getMIn(int a,int b)
    {
        if(a>b)
        return a;
        else
        return b;
    }
}