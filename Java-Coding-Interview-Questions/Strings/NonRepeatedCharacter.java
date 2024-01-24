// How to find Non-repeated Character from String?
/*

Approach-1:
1) It first gets character array from given String.

2) Build Linked Hashmap with character as key and their count as value.
If a key already exists increment the value else store 1 for that corrresponding key.

3) In next step, it loop through LinkedHashMap to find an entry with value 1,
that's your first non-repeated character, because LinkedHashMap maintains
insertion order, and we iterate through character array from beginning to end.

Bad part is it requires two iteration, first one is proportional to number of
character in String, and second is proportional to number of duplicate characters in String.

In worst case, where String contains non-repeated character at end,
it will take 2*N time to solve this problem.

Ex: aabbdef

Step-1: [a,a,b,b,d,e,f]

LinkedHashMap:

| Key | Value |  
|  a  |   2   |
|  b  |   2   |
|  d  |   1   |
|  e  |   1   |
|  f  |   1   |

*/

import java.util.Map;
import java.util.LinkedHashMap;

public class NonRepeatedCharacter {

    public static void main(String[] args) {

        char c = getFirstNonRepeatedChar("aabbddfffff");

        if (c != '\0')
            System.out.println("Non repeated character = "+c);
        else 
            System.out.println("Didn't find any non-repeated character");
    }

    public static char getFirstNonRepeatedChar(String str) {

        Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>(str.length());
        
        for(char ch : str.toCharArray()) {
            countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);
        }

        for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}