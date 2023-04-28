//package programmers;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Keymap {
//
//    public int[] solution(String[] keymap, String[] targets) {
//        int[] answer = {};
//
//        // 최소값이므로 일단 중복 제거
//        // keymap의 각 String...
//
//        HashMap<Character, Integer> charArr = new HashMap<>();
//        String keymapStr = String.join("-",keymap);
//
//        for(int i = 0 ; i < targets.length ; i++) {
//            char[] arr = targets[i].toCharArray();
//            for (int j = 0; j < keymap.length ; j++) {
//                if(keymap[i].indexOf(arr[i]);
//            }
//
//        }
//
//        for(int i = 0 ; i < keymapStr.length()-1  ; i++) {
//            charArr.put(keymapStr.charAt(i), i+1);
//        }
//
//        System.out.println(charArr);
//
//        for(int i = 0 ; i < targets.length-1; i++) {
//
//        }
//
//
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
