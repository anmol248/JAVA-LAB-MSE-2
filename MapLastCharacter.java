package mca;
import java.util.*;

public class MapLastCharacter {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Code");
        System.out.println(list);

        List<Character> result = list.stream()
                .map(s -> s.charAt(s.length() - 1))
                .toList();

        System.out.println(result);
    }
}