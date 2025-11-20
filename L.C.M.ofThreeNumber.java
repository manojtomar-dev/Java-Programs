import java.util.Scanner;

class Question22
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the first number :");
        int a=sc.nextInt();
        System.out.println("Enetr the second number :");
        int b=sc.nextInt();
        System.out.println("Enetr the third number :");
        int c=sc.nextInt();

        int result=getLCM(a,b,c);

        System.out.println("The LCM of three number is : "+result);
    }

    public static int getLCM(int a, int b, int c)
    {
        int big=getBig(a,b,c);
        for(int i=big;;i++)
        {
            if(i%a==0&&i%b==0&&i%c==0)
            return i;
        }
    }
    public static int getBig(int a, int b, int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                return a;
            }
            else{
                return c;
            }
        }
        else{
            return b;
        }
    }
}