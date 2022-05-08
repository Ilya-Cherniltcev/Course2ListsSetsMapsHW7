package sky.pro;

import java.util.ArrayList;
import java.util.List;

public class Task1OddNumbers {

    public void printOddNumbers(List<Integer> numbers) {
        List<Integer> num = new ArrayList<>();
        int n;
        for (int i = 0; i < numbers.size(); i++) {
            n = numbers.get(i);
            if (n % 2 != 0) {
                num.add(n);
            }
        }
        System.out.println(num);
    }
}
