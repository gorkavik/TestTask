package part1task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordCount
{

    public void wordCountAndSort() throws IOException
    {
        System.out.println("Введите предложение:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = reader.readLine().split(",| ");

        //приведение всех слов к одному регистру
        for (int i = 0; i < split.length; i++)
        {
            split[i] = split[i].toLowerCase();
        }
        //сортировка
        Arrays.sort(split);
        //вывод на консоль
        for (int i = 0; i < split.length; i++)
        {
            System.out.println(split[i]);

        }
        System.out.println(split.length + " слов");
    }


}
