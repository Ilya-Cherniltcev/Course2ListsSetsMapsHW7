package sky.pro;

import java.util.*;

public class Task2EvenNumbers {

    // =========== альтернативный вариант сортировки (через структуру TreeSet) ==========================
    public void printEvenNumbersAlternative(List<Integer> numbers) {
        List<Integer> num = new ArrayList<>();
        int n;
        for (int i = 0; i < numbers.size(); i++) {
            n = numbers.get(i);
            if (n % 2 == 0) {
                num.add(n);
            }
        }
        // +++ преобразуем список в множество TreeSet,
        // которое автоматически сортирует элементы и удаляет повторения
        TreeSet<Integer> set = new TreeSet<Integer>(num);

        System.out.println(set);
    }

    // ===========  сортировка самих списков ==========================
    public void printEvenNumbers(List<Integer> numbers) {
        List<Integer> num = new ArrayList<>();
        int n;
        boolean isExist;
        for (int i = 0; i < numbers.size(); i++) {
            n = numbers.get(i);
            isExist = num.contains(n);
    // проверяем на повтор, добавляем в новый список только, если элемент не повторяется
            if (n % 2 == 0 && !isExist) {
                num.add(n);
            }
        }
    // сортируем элементы
        Collections.sort(num);
        System.out.println(num);
    }

}
