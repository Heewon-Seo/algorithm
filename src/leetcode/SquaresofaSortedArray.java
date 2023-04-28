package leetcode;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.

제곱 한 후, 정렬
 */
public class SquaresofaSortedArray {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length ; i++) {
            list.add(nums[i] * nums[i]);
        }

        Collections.sort(list);

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        System.out.println(answer);


    }

}
