package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : list1) {
            set.add(num);
        }

        for (int num : list2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        result.addAll(resultSet);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        List<Integer> result = findCommonElements(list1, list2);

        System.out.println(result);
    }
}