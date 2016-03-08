package MyOwnTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Admin on 08.03.2016.
 */
public class Test2
{
/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String s = buffer.readLine();
        int sum = 0;
        int m = 0;
        while (!s.equals("сумма")){
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.err.println("Неверный формат строки12");
                System.out.println("Было " + sum);
            }
//             sum += m;
            s = buffer.readLine();
        }
        System.out.println(sum);

    }
}



/*
        if (maximum > 0)
        {
            int newmax = maximum;
            for (int count = maximum; count > 0; count--)
            {
                int newint = Integer.parseInt(reader.readLine());
                newmax = (newmax <= newint) ? newint : newmax;
            }
            maximum = newmax;
 */