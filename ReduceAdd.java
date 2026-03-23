package com.unit3;

import java.util.*;

public class ReduceAdd {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}