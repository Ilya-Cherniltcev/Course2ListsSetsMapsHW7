package sky.pro;

import java.util.List;
import java.util.ArrayList;

public class Task6SameChars {

    public void areTheSameChars(String firstWord, String secondWord) {
        boolean isDifferent = false;
        List<Character> firstList = new ArrayList<Character>();
        List<Character> secondList = new ArrayList<Character>();
// ======== переводим строки со словами в список с символами ======
        for (char c : firstWord.toCharArray()) {
            firstList.add(c);
        }
        for (char c : secondWord.toCharArray()) {
            secondList.add(c);
        }
// ========  сравниваем посимвольно каждый List =============
        isDifferent = isDifferentWords(firstList, secondList);
        printFalseTrue(isDifferent, firstWord, secondWord);
        if (isDifferent) {
            return;
        }
// ----------  меняем местами списки ----------------------------------
        isDifferent = isDifferentWords(secondList, firstList);
        printFalseTrue(isDifferent, firstWord, secondWord);
    }

    // ********* внутренний метод, сравнивающий посимвольно  List ************
    private boolean isDifferentWords(List<Character> firstList, List<Character> secondList) {
        for (Character character : firstList) {
            if (!secondList.contains(character)) {
                return true;
            }
        }
        return false;
    }

    // ********* внутренний метод, печатающий fALSE ************
    private void printFalseTrue(boolean isDiff, String firstWord, String secondWord) {
        if (isDiff) {
            System.out.println(firstWord + ", " + secondWord + " -> " + isDiff);
        }
    }

}
