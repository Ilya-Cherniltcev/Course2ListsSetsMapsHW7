package sky.pro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5SumOfDoubles {
    public void printSumOfDoubles(List<Integer> numbers) {
        System.out.println("Исходный список:");
        System.out.println(numbers);
        int start = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            boolean isExist = false;
            start++;
            for (int j = start; j < numbers.size(); j++) {
                if (num == numbers.get(j) && num > 1) {
                    isExist = true;
                    numbers.set(j, 0);
                }
            }
            if (isExist) {
                numbers.set(i, 0);
                isExist = false;
            } else {
                if (num > 1) {
                    numbers.set(i, 1);
                }
            }
        }
        System.out.println("Новый список:");
        System.out.println(numbers);
// ----------- подсчитываем число дублей, последовательно складывая все повторения (значения)
        int sum = 0;
        for (Integer number : numbers) {
            if (number == 1) {
                sum++;
            }
        }
        System.out.println("Сумма списка равна " + sum);
    }
}

