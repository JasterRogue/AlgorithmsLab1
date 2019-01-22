public class MyMath {

    public static int findSmallest(int x, int y, int z)
    {
        int smallest;

        if(x<y && x < z)
        {
            smallest = x;
        }

        else if(y<x && y < z)
        {
            smallest = y;
        }

        else
        {
            smallest = z;
        }

        return smallest;

    }

    public static double myPow(double a, int b)
    {
        double total=1;

        if(b==0)
        {
            total=1;
        }

        else if(b==1)
        {
            total = a;
        }

        else
        {
            for(int i = 1; i <= b; i++)
            {
                total = total*a;
            }
        }

        return total;

    }

    public static int sum(int n)
    {
        int total=0;

        for(int i = 0; i <= n; i++)
        {
            total += i;
        }

        return total;
    }

    public static int calculateFactorial(int n)
    {
        int total=1;

        for(int i = 1; i <= n; i++)
        {
            total = total * i;
        }

        return total;
    }

    public static void isPrime(int n)
    {
        int numberOfFactors=0;

        for(int i=1; i <= n; i++)
        {
            if(n%i==0)
            {
                numberOfFactors++;
            }
        }

        if(numberOfFactors==2)
        {
            System.out.print("Number is a Prime Number");
        }

        else
        {
            System.out.print("Number is not Prime");
        }

    }
}
