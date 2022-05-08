package sky.pro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ********* Задача 1 (поиск нечетных числе) *********************************
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Было: " + nums);
        System.out.print("Стало: ");
        Task1OddNumbers task1 = new Task1OddNumbers();
        task1.printOddNumbers(nums);
// ********* Задача 2 (поиск четных чисел без повторения в порядке возрастания) *******

    }
}
