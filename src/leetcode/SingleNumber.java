package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        int answer = 0;

//        Arrays.sort(nums);

        for(int i=0 ; i != nums.length ; i++) {

            answer ^= nums[i];
            // 비트연산자 XOR (^)
            // 0^N = N
            // N^N = 0
            // N이 하나만 있는 숫자라면
            // N1 ^ N1^ N2 ...
            // 0 ^ 0 ^... N
            // = N
        }

        System.out.println(answer);

    }
}
