package sky.pro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3UniqWords {

    public void printUniqWords2(List<String> words) {
        // +++ преобразуем список в множество HashSet,
        // которое автоматически удаляет повторения
        Set<String> set = new HashSet<String>(words);
        System.out.println(set);
    }

    // ============= вариант со списком ======================
    public List<String> findUniqWords(List<String> words) {
        List<String> fraze = new ArrayList<String>();
        String word;
        boolean isExist;
        for (int i = 0; i < words.size(); i++) {
            word = words.get(i);
            isExist = fraze.contains(word);
            if (!isExist) {
                fraze.add(word);
            }
        }
        return fraze;
    }
}
