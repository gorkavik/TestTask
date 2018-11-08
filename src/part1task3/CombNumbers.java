package part1task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CombNumbers
{
    public void combNumbers() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");

        int n = factorial(str.length);
        int max = str.length - 1;
        System.out.println("Вариантов:" + n);
        int s = max;
        String t;
        while (n > 0)
        {
            t = str[s];
            str[s] = str[s - 1];
            str[s - 1] = t;
            System.out.println(Arrays.toString(str));
            n--;
            if (s < 2)
            {
                s = max;
            } else
            {
                s--;
            }
        }


    }

    private int factorial(int size)
    {
        int result = 1;
        for (int fact = 2; fact <= size; fact++)
        {
            result *= fact;
        }
        return result;
    }


}
