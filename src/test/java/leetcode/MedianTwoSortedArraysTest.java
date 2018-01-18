package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/1/18
 * Time: 14:49
 * Description:
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public class MedianTwoSortedArraysTest {
    @Test
    public void findMedianSortedArrays() throws Exception {
        int[] num1 = {1, 3};
        int[] num2 = {2};
        MedianTwoSortedArrays sortedArrays = new MedianTwoSortedArrays();
        Assert.assertEquals(2.0, sortedArrays.findMedianSortedArrays(num1, num2), 0.0001f);

    }

}