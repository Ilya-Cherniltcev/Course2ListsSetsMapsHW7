package sky.pro;

import java.util.List;
import java.util.ArrayList;

public class Task6SameChars {

    public void areTheySameChars(String firstWord, String secondWord) {
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
        System.out.println("firstList = " + firstList + "    ||||    secondList = " + secondList);
// ========  сравниваем посимвольно каждый List =============
        isDifferent = isDifferentWords(firstList, secondList);
        if (isDifferent) {
            printFalse(firstWord, secondWord);
            return;
        }
// ----------  меняем местами списки ----------------------------------
        isDifferent = isDifferentWords(secondList, firstList);
        if (isDifferent) {
            printFalse(firstWord, secondWord);
            return;
        } else {
            System.out.println(firstWord + ", " + secondWord + " -> " + "true");
        }
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

    // ********* метод, печатающий fALSE ************
    public void printFalse(String firstWord, String secondWord) {
        System.out.println(firstWord + ", " + secondWord + " -> " + "false");
    }

}
