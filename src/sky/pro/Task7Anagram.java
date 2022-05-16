package sky.pro;

import java.util.ArrayList;
import java.util.List;

public class Task7Anagram {
    public void AreTheyAnagrams(String word1, String word2) {
        Task6SameChars task6 = new Task6SameChars();
// ------ проверяем длину обоих слов, если она разная, пишем false ----
        if (word1.length() != word2.length()) {
            task6.printFalse(word1, word2);
            return;
        }
// ---------- преобразуем полученные слова в Listы -----------------------
        List<Character> wordListFirst = new ArrayList<>(word1.length());
        List<Character> wordListSecond = new ArrayList<>(word1.length());

        for (int i = 0; i < word1.length(); i++) {
            wordListFirst.add(word1.charAt(i));
        }
        for (int i = 0; i < word1.length(); i++) {
            wordListSecond.add(word2.charAt(i));
        }
        System.out.println("wordListFirst = " + wordListFirst);
        System.out.println("wordMapSecond = " + wordListSecond);

        boolean areTheSame = wordListFirst.containsAll(wordListSecond);
        boolean areTheSame2 = wordListSecond.containsAll(wordListFirst);
        if (areTheSame && areTheSame2) {
            System.out.println(word1 + ", " + word2 + " -> " + "true");
        } else {
            System.out.println(word1 + ", " + word2 + " -> " + "false");
        }
    }
}