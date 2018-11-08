import part1task1.WordCount;
import part1task2.EvenNumbers;
import part1task3.CombNumbers;

import java.io.IOException;

public class MainClass
{
    public static void main(String[] args) throws IOException
    {

        WordCount count = new WordCount();
        count.wordCountAndSort();

        EvenNumbers numb = new EvenNumbers();
        numb.evenNumbers();

        CombNumbers comb = new CombNumbers();
        comb.combNumbers();

    }
}
