import part1task1.WordCount;
import part1task2.EvenNumbers;
import part1task3.CombNumbers;

import java.io.IOException;

public class MainClass
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите предложение:");
        WordCount count = new WordCount();
        count.wordCountAndSort();

        System.out.println("Введите последовательность целых чисел:");
        EvenNumbers numb = new EvenNumbers();
        numb.evenNumbers();

        System.out.println("Введите последовательность из трех цифр:");
        CombNumbers comb = new CombNumbers();
        comb.combNumbers();

    }
}
