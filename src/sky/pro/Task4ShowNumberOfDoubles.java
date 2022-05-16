package sky.pro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4ShowNumberOfDoubles {
    public void printNumberOfDoubles(List<String> words) {
        List<String> fraze = new ArrayList<String>();
// ---------- делаем новый список с уникальными словами ----------
        Task3UniqWords f = new Task3UniqWords();
        fraze = f.findUniqWords(words);
// ---------- сравниваем длину первоначального списка с новым -----
        int lengthOfLists = words.size() - fraze.size();
        if (lengthOfLists == 0) {
            System.out.println("Повторяющихся слов нет");
            return;
        }
// ---------- преобразуем полученный список в map, где ключ - слово,
// ---------- а значение - число повторений данного слова -----
        Map<String, Integer> frazeMap = new HashMap<>();
        for (String s : fraze) {
// --------   первоначально число повторений каждого слова равно 0
            frazeMap.put(s, 0);
        }
        boolean isExist;
        int numberOfDoubles = 0;
        String key;
// ------------ подсчитываем число повторений каждого слова ------------
        for (int i = 0; i < words.size(); i++) {
            key = words.get(i);
            isExist = frazeMap.containsKey(key);
            numberOfDoubles = frazeMap.get(key);
            if (isExist) {
                numberOfDoubles++;
                frazeMap.replace(key, numberOfDoubles);
            }
        }
        System.out.println(frazeMap);
// ----------- подсчитываем число дублей, последовательно складывая все повторения (значения)
        int value = 0;
        numberOfDoubles = 0;
        for (Map.Entry<String, Integer> entry : frazeMap.entrySet()) {
            value = entry.getValue();
            if (value != 1) {
                numberOfDoubles += value;
            }
        }
        System.out.println("Число дублей - " + numberOfDoubles);
    }
}

