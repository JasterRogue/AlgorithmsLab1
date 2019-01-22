import java.util.ArrayList;
import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList numbers = new ArrayList();
        int entry;

        System.out.print("Enter a number between 1 and 100: ");
        entry = input.nextInt();

        while(entry>-1)
        {
            numbers.add(entry);

            System.out.print("Enter a number between 1 and 100: ");
            entry = input.nextInt();
        }



    }
}
