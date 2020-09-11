package com.lhn.数学;

/**
 * @author lhn
 * @date 2020/8/23 13:06
 */
public class L461汉明距离 {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
