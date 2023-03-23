package leetcode;

public class BadVersion {
//You are a product manager and currently leading a team to develop a new
//product. Unfortunately, the latest version of your product fails the quality check.
//Since each version is developed based on the previous version, all the versions
//after a bad version are also bad.
//
// Suppose you have n versions [1, 2, ..., n] and you want to find out the
//first bad one, which causes all the following ones to be bad.
//
// You are given an API bool isBadVersion(version) which returns whether
//version is bad. Implement a function to find the first bad version. You should
//minimize the number of calls to the API.
//
//
// Example 1:
//
//
//Input: n = 5, bad = 4
//Output: 4
//Explanation:
//call isBadVersion(3) -> false
//call isBadVersion(5) -> true
//call isBadVersion(4) -> true
//Then 4 is the first bad version.
//
//
// Example 2:
//
//
//Input: n = 1, bad = 1
//Output: 1
//
//
//
// Constraints:
//
//
// 1 <= bad <= n <= 2³¹ - 1
//
//
// Related Topics Binary Search Interactive 👍 7274 👎 2884


//leetcode submit region begin(Prohibit modification and deletion)
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public boolean isBadVersion(int version) {
        return true;
    }


    public int firstBadVersion(int n) {

        // 첫번째 bad version을 찾아라! (최소값)
        // version은 n개 있음 (1,2,3,4,...n)
        int left = 1; // 최소값
        int right = n; // 최대값

        while (left < right) {
            int mid = left + (right - left) / 2; // 중앙값
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;

        /*
        Here, we have to find smallest bad version.To optimize search we are using binary search.

        1) Initialize left as 1 and right as n.

        2) We have to find mid. If we use mid = left+right/2 you will face overflow issue. To overcome this,
        calculate mid using mid = left+(right - left)/2 [To understand this, read below example]
             Example: Consider int can hold a max of 200 so take left=80 right=160, left+right=240 > than int can hold
             i.e overflow but 80+(160-80)/2 = 80+40, the number never went greater than 200.

        3)Do iteration till left is smaller than right. Though mid is badVersion, we cannot confirm it as small bad version. So, we update that mid as right and incrementing left until it fails loop.
        Finally, left will be the smallest badVersion.

        Time Complexity: O(log n)

         */


//        for (int i = 1; i <= n; i++) {
//            if(isBadVersion(i)) return answer = i;
//        }
//        return answer;
    }
}
