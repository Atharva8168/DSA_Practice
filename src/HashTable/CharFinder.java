package HashTable;

import java.util.*;

public class CharFinder {


    public char firstNonRepeatingChar(String input){
        Map<Character, Integer> map = new HashMap<>();
        var chars = input.toCharArray();
        for(var ch : chars){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch , count+1);
        }

        for (var ch : chars)
            if (map.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;
    }


    public char firstRepeatedCharacter(String input){
        Set<Character> set = new HashSet<>();

        for (var ch : input.toCharArray()){
            if (set.contains(ch))
                return ch;
            else{
                set.add(ch);
            }
        }
        return Character.MIN_VALUE;
    }
}
