package com.lhn;

/**
 * @author lhn
 * @date 2020/8/23 13:06
 */
public class L461HammingDistance {
    public static void main(String[] args) {
        System.out.println(new L461HammingDistance().hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
