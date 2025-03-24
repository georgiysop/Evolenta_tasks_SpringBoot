//💡 Задание: Используя stream api напишите метод `getArithmeticProgressionSum`,
// принимающий на вход два числа a, b типа int и вычисляющий сумму чисел между числами a и b, включая a и исключая b.
// Ответ должен иметь тип long.
//
//Например: a = 3, b = 6. Ответ: 12 (3 + 4 + 5).
//
//Найдите ответ для чисел 10_000_000 и 1_000_000_000 и выведите в консоль.
import java.util.stream.LongStream;

public class  Main {

    public static long getArithmeticProgressionSum(int a, int b) {
        return LongStream.range(a, b).sum();
        }

    public static void main(String[] args) {
        long sum = getArithmeticProgressionSum(10_000_000, 1_000_000_000);
        System.out.println(sum);

    }
}