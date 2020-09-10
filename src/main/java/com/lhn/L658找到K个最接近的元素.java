package com.lhn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/9/10 23:14
 */
public class L658找到K个最接近的元素 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> res = new ArrayList<>();
        int length = arr.length;
        if (x <= arr[0]) {
            for (int i = 0; i < k; i++) {
                res.add(arr[i]);
            }
            return res;
        }
        if (x >= arr[length - 1]) {
            for (int i = length - k; i < length; i++) {
                res.add(arr[i]);
            }
            return res;
        }

        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left + 1 < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                break;
            } else if (arr[mid] > x) {
                right = mid;
            } else if (arr[mid] < x) {
                left = mid;
            }
        }

        int index = Math.abs(arr[left] - x) <= Math.abs(arr[right] - x) ? left : right;

        int leftindex = index - 1;
        int rightindex = index + 1;

        while (rightindex - leftindex - 1 < k) {
            if (leftindex < 0) {
                rightindex++;
                continue;
            }
            if (rightindex >= length) {
                leftindex--;
                continue;
            }
            if (Math.abs(x - arr[leftindex]) <= Math.abs(arr[rightindex] - x)) {
                leftindex--;
            } else {
                rightindex++;
            }

        }

        for (int i = leftindex + 1; i < rightindex; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
