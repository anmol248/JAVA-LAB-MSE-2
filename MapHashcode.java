package com.unit3;

import java.util.*;

public class MapHashcode {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python");
        System.out.println(list);

        List<Integer> result = list.stream()
                .map(s -> s.hashCode())
                .toList();

        System.out.println(result);
    }
}
