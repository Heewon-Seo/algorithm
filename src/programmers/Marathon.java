package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Marathon {

    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = "";
        List<String> memberList = new ArrayList<>(Arrays.asList(participant));
        List<String> memberList2 = new ArrayList<>(Arrays.asList(completion));
        memberList.addAll(memberList2);

        for(String member : memberList) {
            System.out.println("member: "+member);
            int freq = Collections.frequency(memberList,member);
            if(freq%2!=0) answer = member;
        }

        System.out.println(answer);

    }

        }
