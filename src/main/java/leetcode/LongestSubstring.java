package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/14
 * Time: 19:30
 * Description: leetcode3 Longest Substring without repeating character
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0){
            return 0;
        }

        char[] chars = s.toCharArray();
        int start = 0;
        int result = 0;

        Map<Character, Integer> map = new HashMap<Character, Integer>(16);
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            if (map.keySet().contains(chars[i])){
                int tempMax = i - start;
                result = Math.max(result, tempMax);
                start = Math.max(start, map.get(chars[i]) + 1);
            }
            map.put(chars[i], i);
        }
        result = Math.max(result, length - start);
        return result;
    }

}
