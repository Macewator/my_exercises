package exercises.arrays;

import java.util.Arrays;

public class TabMethodTest {
    public static void main(String[] args) {
        int[][] tabOne = {{2,5,7},{4,1,9}};
        int[][] tabTwo = {{9,8,7},{9,1,9}};
        String[] words1 = {"aa","bb"};
        String[] words2 ={"aaa","bbb"};
        int[] nums = {6,7,9,2,1};

        int[][] biggerArray = TabTest.getBiggerArray(tabOne, tabTwo);
        System.out.println("Większa tablica:");
        for (int[] ints : biggerArray) {
            System.out.println(Arrays.toString(ints));
        }

        String[] newWords = TabTest.moreChars(words1,words2);
        System.out.println("Tablica z większą ilością znaków:");
        System.out.println(Arrays.toString(newWords));

        int maxNum = TabTest.max(nums);
        int minNum = TabTest.min(nums);
        System.out.println("Największa liczba z tablicy " + Arrays.toString(nums));
        System.out.println(maxNum);
        System.out.println("Najmniejsza liczba z tablicy " + Arrays.toString(nums));
        System.out.println(minNum);

        int[] maxRow = TabTest.maxRow(tabOne);
        System.out.println("Wiersz z największą sumą liczb: " + Arrays.toString(maxRow));
    }
}
