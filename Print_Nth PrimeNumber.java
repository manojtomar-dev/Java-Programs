import java.util.Scanner;

class Question3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position which prime number you want");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;;i++)
        {
            if(isPrime(i))
            {
                count++;
                if(count==n)
                {
                    System.out.println(n+"th prime nummber is : "+i);
                    break;
                }
            }
            
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
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}