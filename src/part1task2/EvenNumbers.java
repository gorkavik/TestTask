package part1task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EvenNumbers
{
    public void evenNumbers() throws IOException
    {
        System.out.println("Введите последовательность целых чисел:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = reader.readLine().split(" ");

        Integer[] splitInt = new Integer[split.length];
        ArrayList<Integer> evenInt = new ArrayList<>();
        //преобразование символов в числа
        for (int i = 0; i < split.length; i++)
        {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        //поиск четных чисел и их сумма
        int a, j = 0;
        int sum = 0;
        for (int i = 0; i < splitInt.length; i++)
        {
            a = splitInt[i] % 2;
            if (a == 0)
            {
                evenInt.add(splitInt[i]);
                sum = sum + splitInt[i];
                j++;
            }
        }
        //вывод на консоль
        for (int i = 0; i < evenInt.size(); i++)
        {
            System.out.println(evenInt.get(i));

        }
        System.out.println("сумма=" + sum);

    }
}
