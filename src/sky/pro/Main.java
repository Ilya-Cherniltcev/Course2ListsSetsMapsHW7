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
        System.out.println("------------  конец задачи 1 ------------ ");

// ********* Задача 2 (поиск четных чисел без повторения в порядке возрастания) *******
        Task2EvenNumbers task2 = new Task2EvenNumbers();
        nums = new ArrayList<>(List.of(100, 10, 21, 34, 34, 48, 42, 48, 53, 55, 10, 60, 17, 18, 18));
        System.out.println("Было: " + nums);
        System.out.print("Стало: ");
        task2.printEvenNumbers(nums);
        System.out.println("------------ выполняем с помощью TreeSet --------------");
        task2.printEvenNumbersAlternative(nums);
        System.out.println("------------  конец задачи 2 ------------ ");

// ********* Задача 3 (вывод уникальных слов в консоль) *******
        Task3UniqWords task3 = new Task3UniqWords();
        List<String> words = new ArrayList<>(List.of("Шаблон", "Шар", "Дефект", "Нож",
                "Дефект", "Шаблон", "Металл", "Шаблон", "Шар"));
        System.out.println("Было: " + words);
        System.out.print("Стало: ");
        System.out.println(task3.findUniqWords(words));
        System.out.println("------------ выполняем с помощью HashSet --------------");
        task3.printUniqWords2(words);
        System.out.println("------------  конец задачи 3 ------------ ");

// ********* Задача 4 (подсчет дублей) *******
        words = new ArrayList<>(List.of("кот", "шар", "двор", "кот", "мост", "шар", "металл", "конь", "двор", "слон"));
        System.out.println(words);
        Task4ShowNumberOfDoubles task4 = new Task4ShowNumberOfDoubles();
        task4.printNumberOfDoubles(words);
    }
}
