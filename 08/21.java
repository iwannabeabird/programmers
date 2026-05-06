package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"}));
    }

    public static String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        for(int i=0; i<record.length; i++) {
            String[] message = record[i].split(" ");
            if("Enter".equals(message[0]) || "Change".equals(message[0])){
                userMap.put(message[1], message[2]);
            }
        }

        List<String> resultList = new ArrayList<>();
        for(int j=0; j<record.length; j++) {
            String[] message = record[j].split("");
            if("Change".equals(message[0])) {
                continue;
            }

            StringBuffer sb = new StringBuffer();
            String nickName = userMap.get(message[1]);
            sb.append(nickName);

            if("Enter".equals(message[0])) {
                sb.append("님이 들어왔습니다.");
            } else { // "Leave"
                sb.append("님이 나갔습니다.");
            }

            resultList.add(sb.toString());
        }

        String[] answer = new String[resultList.size()];
        for(int k=0; k<resultList.size(); k++) {
            answer[k] = resultList.get(k);
        }

        return answer;
    }
}
