package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/14
 * Time: 19:41
 * Description:
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public class LongestSubstringTest {

    @Test
    public void lengthOfLongestSubstringCase1() {
        LongestSubstring substring = new LongestSubstring();
        int result = substring.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3, result);
    }


    @Test
    public void lengthOfLongestSubstringCase2() {
        LongestSubstring substring = new LongestSubstring();
        int result = substring.lengthOfLongestSubstring("bbbbb");
        Assert.assertEquals(1, result);
    }


    @Test
    public void lengthOfLongestSubstringCase3() {
        LongestSubstring substring = new LongestSubstring();
        int result = substring.lengthOfLongestSubstring("pwwkew");
        Assert.assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstringCase4() {
        LongestSubstring substring = new LongestSubstring();
        int result = substring.lengthOfLongestSubstring("p");
        Assert.assertEquals(1, result);
    }

    @Test
    public void lengthOfLongestSubstringCase5() {
        LongestSubstring substring = new LongestSubstring();
        int result = substring.lengthOfLongestSubstring("au");
        Assert.assertEquals(2, result);
    }

    @Test
    public void lengthOfLongestSubstringCase6() {
        LongestSubstring substring = new LongestSubstring();
        int result = substring.lengthOfLongestSubstring("dvdf");
        Assert.assertEquals(3, result);
    }


    @Test
    public void lengthOfLongestSubstringCase7() {
        LongestSubstring substring = new LongestSubstring();
        int result = substring.lengthOfLongestSubstring("abba");
        Assert.assertEquals(2, result);
    }

}