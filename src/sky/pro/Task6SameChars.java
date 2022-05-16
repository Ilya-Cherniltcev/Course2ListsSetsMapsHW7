package sky.pro;

import java.util.List;
import java.util.ArrayList;

public class Task6SameChars {

    public void areTheySameChars(String word1, String word2) {
// ---------- преобразуем полученные слова в Listы -----------------------
        List<Character> wordListFirst = new ArrayList<>(word1.length());
        List<Character> wordListSecond = new ArrayList<>(word1.length());

        for (int i = 0; i < word1.length(); i++) {
            wordListFirst.add(word1.charAt(i));
        }
        for (int i = 0; i < word2.length(); i++) {
            wordListSecond.add(word2.charAt(i));
        }

        boolean areTheSame = wordListFirst.containsAll(wordListSecond);
        boolean areTheSame2 = wordListSecond.containsAll(wordListFirst);
        if (areTheSame && areTheSame2) {
            System.out.println(word1 + ", " + word2 + " -> " + "true");
        } else {
            System.out.println(word1 + ", " + word2 + " -> " + "false");
        }
    }
}
