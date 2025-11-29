import java.util.Scanner;

class Question20{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check it is automorphic number or not");
        int n=sc.nextInt();
        boolean result=isAutomorphic(n);

        if(result)
        {
            System.out.println(n+" is the Automorphic number");
        }
        else{
             System.out.println(n+" is not the Automorphic number");
        }
    }

    public static boolean isAutomorphic(int n)
    {
        int numberLastDigit=n%10;
        int square=n*n;
        int squarelast=square%10;

        if(numberLastDigit==squarelast)
        return true;

        else
        return false;
    }
}