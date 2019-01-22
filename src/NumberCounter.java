import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList numbers = new ArrayList();
        int numberCounterArray[] = new int[101];
        int entry;
        Arrays.fill(numberCounterArray, 0);

        System.out.print("Enter a number between 1 and 100: ");
        entry = input.nextInt();

        while(entry>-1)
        {
            numbers.add(entry);

            System.out.print("\nEnter a number between 1 and 100: ");
            entry = input.nextInt();
        }

        for(int i=0;i<numbers.size();i++)
        {
            numberCounterArray[(int)numbers.get(i)]++;
        }

        for(int i =0;i<numberCounterArray.length;i++)
        {
            System.out.print("\nNumber " + i + " appeared " + numberCounterArray[i] + " times");
        }





    }
}
