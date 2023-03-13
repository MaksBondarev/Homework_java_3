// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Homework_3;

import java.util.*;

public class HW_3 {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(8);
        arr.add(32);
        arr.add(21);
        arr.add(31);
        arr.add(2);

        int min = arr.get(0);
        int max = arr.get(0);

        int n = arr.size();

        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }

        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
    }
}