package leetcode;

import java.security.InvalidParameterException;
import java.util.*;

/**
 * 电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */

public class LetterCombinations {

    private static final List<String> result = new ArrayList<>();
    public  static List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0){
            return result;
        }
        HashMap<Character,String[]> map = new HashMap<Character,String[]>();
        map.put('2', new String[]{"a","b","c"});
        map.put('3', new String[]{"d","e","f"});
        map.put('4', new String[]{"g","h","i"});
        map.put('5', new String[]{"j","k","l"});
        map.put('6', new String[]{"m","n","o"});
        map.put('7', new String[]{"p","q","r","s"});
        map.put('8', new String[]{"t","u","v"});
        map.put('9', new String[]{"w","x","y","z"});
        findCombinations(digits, 0, "", map);
        return result;
    }

    private static void findCombinations(String digits, int index, String tmp, HashMap<Character, String[]> map) {
        if (tmp.length() == digits.length()) {
            result.add(tmp);
            return;
        }
        String[] arr = map.get(digits.charAt(index));
        if(arr == null){
            throw new InvalidParameterException("非法参数");
        }
        for (int i = 0 ; i < arr.length; i++) {
            // 回溯
            findCombinations(digits, index+1, tmp + map.get(digits.charAt(index))[i], map);
        }
    }
}
