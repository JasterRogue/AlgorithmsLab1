public class WordCounter {
    public static void main(String[] args)
    {
        //System.out.print("Number of Words: " + wordCounter("A Star is Born"));
        //Expected Result: 4
        //Result : 4

        //System.out.print("Number of Words: " + wordCounter("It's over Anakin, I have the high ground"));
        //Expected Result: 8
        //Result : 8

        //System.out.print("Number of Words: " + wordCounter("The 29th January is 5 days away"));
        //Expected Result: 7
        //Result : 7
    }

    public static int wordCounter(String sentence)
    {
        int numberOfWords=1;

        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i)==' ')
            {
                numberOfWords++;
            }
        }

        return numberOfWords;


    }
}
