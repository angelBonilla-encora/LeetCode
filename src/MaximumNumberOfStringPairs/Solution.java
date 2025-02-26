package MaximumNumberOfStringPairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Map<String, Integer> hashTable = new HashMap<String,Integer>();
        int numberOfPairs = 0;

        for (String word : words) {
            String reverseCurrentWord = new StringBuilder(word).reverse().toString();
            if (hashTable.containsKey(reverseCurrentWord)) {
                numberOfPairs += 1;
            }
            hashTable.put(word, 1);
        }
        return numberOfPairs;


    }
}