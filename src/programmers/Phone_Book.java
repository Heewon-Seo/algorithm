package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Phone_Book {



    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"};
        boolean answer = true;

        Arrays.sort(phone_book, (o1, o2) -> o2.length()-o1.length());

        HashMap<String, String> hm = new HashMap();

        for(String s : phone_book) {

            if(hm.get(s)!=null) {
                answer = false;
            }

            for(int i = 1; i<=s.length(); i++) {
                hm.put(s.substring(0,i),"");
            }

        }

//        for(int i = 0 ; i < phone_book.length-1 ; i++) {
//            if(phone_book[i].startsWith(phone_book[i+1])) {
//                array.put(phone_book[i],array.getOrDefault(phone_book[i],0)+1);
//            }
//        }

//        for (String s : phone_book) {
//            for (String number : phone_book) {
//                if (number.startsWith(s)) {
//                    array.put(s,array.getOrDefault(s,0)+1);
//                }
//            }
//        }

        for (Map.Entry<String,String> numberMap : hm.entrySet()) {
            System.out.printf("%s : %s \t",numberMap.getKey(),numberMap.getValue());
//            if(numberMap.getValue()>1) {
//                answer = false;
//            }
        }

//        for (String number : phone_book) {
//            number.startsWith(phone_book[i])
//            array.put(number,array.getOrDefault(number.substring(0,1),0)+1);
//        }
//


        System.out.println(answer);
    }

}
