package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        // 타겟을 찾으면 인덱스 반환
        // 못찾으면 배열에 삽입 후(오름차순 정렬), 해당 인덱스 반환
        // 시간복잡도는 O(log n)으로

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                return i;
            }
        }

        List<int[]> list = Arrays.asList(nums);
        System.out.println(list);

            return Arrays.asList(nums).indexOf(target);


    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        int answer = -1;

        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i] == target) {
                answer = i;
            }
        }

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.add(target);
        Collections.sort(list);
        answer = list.indexOf(target);

        System.out.println("answer:::: " + answer);

    }
}
